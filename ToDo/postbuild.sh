#gem install heroku
#heroku plugins:install https://github.com/heroku/heroku-deploy
#heroku deploy:war --war /home/travis/build/willsmythe/MobileTodo/target/resteasy.war --app mobiletodo 

#curl -i -F name=test -F filedata=@/home/travis/build/willsmythe/MobileTodo/target/TodoServices.war http://ec2-54-245-163-198.us-west-2.compute.amazonaws.com/upload
#curl -F "FileUpload=@TodoServices.war" http://ec2-54-245-163-198.us-west-2.compute.amazonaws.com/upload

curl -F "upload=@/home/travis/build/willsmythe/MobileTodo/target/TodoServices.war" http://ec2-54-245-163-198.us-west-2.compute.amazonaws.com/upload