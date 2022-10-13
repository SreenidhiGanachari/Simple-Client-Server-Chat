importjava.net.*;  
importjava.io.*;  
class server1{  
publicstaticvoidmain(String args[])throws Exception{  
ServerSocketss=newServerSocket(3334);  
Socket s=ss.accept();  
DataInputStreamdin=newDataInputStream(s.getInputStream());  
DataOutputStreamdout=newDataOutputStream(s.getOutputStream());  
BufferedReaderbr=newBufferedReader(newInputStreamReader(System.in));  

String str="",str2="";  
while(!str.equals("end")){  
str=din.readUTF();  
System.out.println("client says: "+str);  
str2=br.readLine();  
dout.writeUTF(str2);  
dout.flush();  
}  
din.close();  
s.close();  
ss.close();  
}} 
