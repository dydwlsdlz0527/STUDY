const fs = require('fs');
/* fs.readdir("./",(err,files) => {
    if(err){
        console.log(err);
    }
    console.log(files);
});
 */
fs.readFile("./example.txt","utf8",(err,data)=>{
    if(err){
        console.log(err);
    }
   // console.log(data);
   fs.writeFile("./test.txt",data,'utf8',(err)=>{
        if(err){
            console.log(err)
        }
   });
});