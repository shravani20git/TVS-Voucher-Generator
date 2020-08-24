/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
class Voucher {
    
    private int No , Ammount;
    private String Name, Date , Payment , Details;
    
    public Voucher( int No,String Name, String Date, int Ammount , String Payment ,String Details)
    {
    this.No= No;
    this.Name= Name;
    this.Date = Date;
    this.Ammount = Ammount;
    this.Payment = Payment;
    this.Details = Details;
   
    }
    
    public int getNo(){ return No;}
     public String getName(){ return Name;}
     public String getDate(){ return Date;}
     public int getAmmount(){ return Ammount;}
     public String getPayment(){ return Payment;}
     public String getDetails(){ return Details;}
     
     
    
}
