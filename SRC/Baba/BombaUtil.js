if Object = [y:1200,x:900 > (true)],
bva.CreateNewRow(LoadSomeFile(UrlFromPath("%Emp%","Storage","Emulated",0,"?NewFile?:[!*0.media*!]"),bva.CreateFileCode = "0")),
bva.WhenFileIsClicked = "ShowToast(true,*Opened*)",FileSelect(true),FileNamedOnAnFolder("0","media"),
bva.OnFloatingActivities(WhenActivitiesStartFloatingAndDebugged(ConstantFunction(true))),
bva.WhenStarted(r:"ShowToast(true,*Subscribe To Nbc Before Running*"),(r:"GoToDirectedUrl*https://youtube.com/@RilPyshic7Bomba?si=gn0bE8gP7kvV5v8Q*")