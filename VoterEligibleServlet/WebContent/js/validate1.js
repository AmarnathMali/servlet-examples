function myfun()
{
  var age = document.votingform.age.value;
  
  if(age==(""))
	  {
	  alert("please enter age!!!");
	  return false;
	  }
  return true;
}