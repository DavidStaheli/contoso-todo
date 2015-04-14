var formidable = require('formidable'),
    http = require('http'),
    util = require('util');
fs = require('fs');

http.createServer(function(req, res) {
  if (req.url == '/upload' && req.method.toLowerCase() == 'post') {
    // parse a file upload
    var form = new formidable.IncomingForm();

    form.parse(req, function(err, fields, files) {
      res.writeHead(200, {'content-type': 'text/plain'});
      res.write('received upload:\n\n');

if (files.upload.name.indexOf("TodoServices.war") != -1) {
console.log("Publishing TodoServices.war");

     fs.createReadStream(files.upload.path).pipe(fs.createWriteStream('C:\\Program Files\\Apache Software Foundation\\Tomcat 7.0\\webapps\\' + files.upload.name));

} else {
console.log("NOT publishing "+ files.upload.name);
}
      res.end(util.inspect({fields: fields, files: files}));


    });

    return;
  }

  // show a file upload form
  res.writeHead(500, {'content-type': 'text/html'});
  res.end('Invalid request');
}).listen(80);