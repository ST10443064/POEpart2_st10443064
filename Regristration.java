/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class Regristration {
    private String username;
private String password;
private String name;
private String surname;
public Regristration(String username,String password, String name, String surname){
super();
this.username =username;
this.password = password;
this.name =name;
this.surname=surname;
}
//setters and getters
public String getUsername(){
return username;
}
public void setUsername(String username){
this.username = username;
}
public String getPassword(){
return password;
}
public void setPassword(String password) {
this.password=password;
}
public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}
public String getSurname(){
return surname;
}
public void setSurname(String surname){
this.surname = surname;
}
public boolean checkUserName()
{
boolean bvalid= false;
if(username.length()>5 || username.length()==1 )
{
    return bvalid;
}
else
{
if(username.contains("_")==true)
{
bvalid=true;
}
return bvalid;
}
}
//Checking the password complexity
public boolean PasswordComplexity()
{
if (password.length()<8)
{
return false;
}
else
{
boolean bUppercase=false;
boolean bNum=false;
boolean bSpecial=false;
int x=0;
while( x<password.length())
{
if( (int)password.charAt(x)>=65 && (int)password.charAt (x)<90)
{
    bUppercase=true;
}
if ((int)password.charAt(x)>=48 && (int)password.charAt(x)<=57)
{
bNum=true;
}
if(((int)password.charAt(x)>=32 && (int)password.charAt(x)<=47)||((int)password.charAt(x)>=58 && (int)password.charAt(x)<64)|| ((int)password.charAt(x)>91 &&(int)password.charAt(x)<=96)||((int)password.charAt(x)>=123 && (int)password.charAt(x)<=126))
{
bSpecial=true;
}
x++;
}
return (bUppercase && bNum && bSpecial);
}
}
//Registering the user
public String registerUser()
{
String output="";
if (this.checkUserName()==true)
{
output=output +"Username succesfuly captured\n"; //fill in
}
else
{
output=output+"Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length\n";
}
if (this.PasswordComplexity()== true)
{
output=output +"Password successfully captured\n";
}
else
{
output=output+"Password not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character\n";
}
if (this.checkUserName()==true && this.PasswordComplexity()==true)
{
output=output +"Welcome <user first name>, <user last name> is is great to see you again\n";
}
else
{
output=output+"username or password incorrect, please try again\n";
}
return output;
}
}



