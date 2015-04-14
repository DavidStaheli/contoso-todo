Param(
    [String] [Parameter(Mandatory = $true)]
    $Action,

    [String] [Parameter(Mandatory = $true)]
    $Name,

    [String]
    $Slot
)

if ($Action -eq "start")
{
    if ($Slot)
    {
        Start-AzureWebSite -Name $Name -Slot $Slot
    }
    else
    {
        Start-AzureWebSite -Name $Name
    }
}
elseif ($Action -eq "stop")
{
    if ($Slot)
    {
        Stop-AzureWebSite -Name $Name -Slot $Slot
    }
    else
    {
        Stop-AzureWebSite -Name $Name
    }
}

if ($Action -eq "swap")
{
    if (!$Slot)
    {
        throw "Must specify slot to swap."
    }

    Switch-AzureWebsiteSlot -Name $Name -Slot1 $Slot -F
}
