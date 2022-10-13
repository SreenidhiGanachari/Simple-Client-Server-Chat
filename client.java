importjava.net.*;  
importjava.io.*;  
class client1{  
publicstaticvoidmain(String args[])throws Exception{  
Socket s=new Socket("localhost",3334);  
DataInputStreamdin=newDataInputStream(s.getInputStream());  
DataOutputStreamdout=newDataOutputStream(s.getOutputStream());  
BufferedReaderbr=newBufferedReader(newInputStreamReader(System.in));  

String str="",str2="";  
while(!str.equals("end")){  
str=br.readLine();  
dout.writeUTF(str);  
dout.flush();  
str2=din.readUTF();  
System.out.println("Server says: "+str2);  
}  

dout.close();  
s.close();  
}}  
