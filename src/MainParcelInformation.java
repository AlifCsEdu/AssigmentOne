import javax.swing.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;


public class MainParcelInformation {
    public static void main (String[] args)
    {
        try
        {
            //Create FileReader
            BufferedReader in = new BufferedReader(new FileReader("Courier.txt"));

            ArrayList<ParcelInformation> ParcelList = new ArrayList<>();

            ParcelInformation ParcelInformation;

            String data = null;

            while((data = in.readLine())!=null)
            {
                StringTokenizer st = new StringTokenizer(data, ";");
                String TrackingNumber = st.nextToken();
                String SenderName = st.nextToken();
                String RecipientName = st.nextToken();
                String SenderAddress = st.nextToken();
                String RecipientAddress = st.nextToken();
                int PostcodeTo = Integer.parseInt(st.nextToken());
                int PostcodeFrom = Integer.parseInt(st.nextToken());
                double ParcelWeight = Double.parseDouble(st.nextToken());
                double ParcelLength = Double.parseDouble(st.nextToken());
                double ParcelHeight = Double.parseDouble(st.nextToken());
                String ShippingType = st.nextToken();
                String ParcelType = st.nextToken();
                String ShippingCategory= st.nextToken();
                String ShippingDate = st.nextToken();
                String DeliveryDate = st.nextToken();

                ParcelInformation = new ParcelInformation(TrackingNumber,SenderName,RecipientName,SenderAddress,RecipientAddress,PostcodeTo,PostcodeFrom,ParcelWeight,ParcelLength,ParcelHeight,ShippingType,ParcelType,ShippingCategory,ShippingDate,DeliveryDate);

                ParcelList.add(ParcelInformation);
            }
            in.close();

            int menu = 0;
            do
            {

                menu = Integer.parseInt(JOptionPane.showInputDialog("Please choose the following menu \n Press 1 to Insert Data \n Press 2 to Update the Data \n Press 3 to Remove Data\n Press 4 to Display the Parcels Info Submenu \n Press 5 to Exit the Program"));

                if(menu == 1)
                {
                    int trackNum = 1025 + 1;
                    String TrackingNumber = "" +trackNum;
                    String SenderName = JOptionPane.showInputDialog("Enter Sender Name : ");
                    String RecipientName = JOptionPane.showInputDialog("Enter Recipient Name : ");
                    String SenderAddress = JOptionPane.showInputDialog("Enter Sender Address : ");
                    String RecipientAddress = JOptionPane.showInputDialog("Enter Recipient Address : ");
                    int PostcodeTo = Integer.parseInt(JOptionPane.showInputDialog("Enter PostCode To : "));
                    int PostcodeFrom = Integer.parseInt(JOptionPane.showInputDialog("Enter PostCode From : "));
                    double ParcelWeight = Double.parseDouble(JOptionPane.showInputDialog("Enter Weight of the Parcel : "));
                    double ParcelLength = Double.parseDouble(JOptionPane.showInputDialog("Enter Length of the Parcel : "));
                    double ParcelHeight = Double.parseDouble(JOptionPane.showInputDialog("Enter Height of the Parcel : "));
                    String ShippingType = JOptionPane.showInputDialog("Enter Shipping Type : ");
                    String ParcelType = JOptionPane.showInputDialog("Enter Parcel Type : ");
                    String ShippingCategory = JOptionPane.showInputDialog("Enter Shipping Category : ");
                    String ShippingDate = JOptionPane.showInputDialog("Enter Shipping Date : ");
                    String DeliveryDate = JOptionPane.showInputDialog("Enter Delivery Date : ");

                    ParcelInformation = new ParcelInformation(TrackingNumber,SenderName,RecipientName,SenderAddress,RecipientAddress,PostcodeTo,PostcodeFrom,ParcelWeight,ParcelLength,ParcelHeight,ShippingType,ParcelType,ShippingCategory,ShippingDate,DeliveryDate);

                    ParcelList.add(ParcelInformation);
                }
                else if (menu == 2)
                {

                    String TrackNumb = JOptionPane.showInputDialog("Enter The Tracking Number to update the Record's date");
                    for(int i = 0; i<ParcelList.size(); i++)
                    {
                        ParcelInformation = ParcelList.get(i);
                        if(ParcelInformation.getTrackingNumber().equalsIgnoreCase(TrackNumb))
                        {
                            String DeliverDate = JOptionPane.showInputDialog("Enter the New Delivery Date");
                            ParcelInformation.setDeliveryDate(DeliverDate);
                            ParcelList.set(i, ParcelInformation);
                        }
                    }
                }
                else if (menu == 3)
                {

                    String TrackNumb = JOptionPane.showInputDialog("Enter The Tracking Number to Delete The Record's Data");
                    for(int i = 0; i<ParcelList.size(); i++)
                    {
                        ParcelInformation = ParcelList.get(i);
                        if (ParcelInformation.getTrackingNumber().equalsIgnoreCase(TrackNumb));
                        {
                            ParcelList.remove(ParcelInformation);
                        }

                    }
                }
                else if (menu == 4)
                {
                    int menu2 = 0;
                    do
                    {
                        menu2 = Integer.parseInt(JOptionPane.showInputDialog("Choose to Display \n Type 1 : to Display ALL Parcel \n Type 2 : to Display Domestic Only \n Type 3 : to Display International Parcel Only \n Type 4 : to Count Fragile & Non-Fragile Parcel \n Type 5 : to Display Large Parcel (5KG and Above)\n Type 6 : to Display Parcel to Is delivered on the next day \n Type 7 : to go to the Main Menu"));

                        if(menu2 == 1)
                        {
                            int x = 1;
                            for(int i = 0; i<ParcelList.size(); i++)
                            {
                                System.out.println(x++ + "" + ParcelList.get(i).toString());
                            }
                        }
                        else if(menu2 == 2)
                        {
                            int y = 1;
                            for(int i = 0; i<ParcelList.size(); i++)
                            {
                                ParcelInformation = ParcelList.get(i);
                                if(ParcelInformation.getShippingCategory().equalsIgnoreCase("Domestic"))
                                {
                                    System.out.println(y++ + "" + ParcelList.get(i));
                                }
                            }
                        }
                        else if (menu2 == 3)
                        {
                            int z = 1;
                            for(int i = 0; i<ParcelList.size(); i++)
                            {

                                ParcelInformation = ParcelList.get(i);
                                if(ParcelInformation.getShippingCategory().equalsIgnoreCase("International"))
                                {
                                    System.out.println(z++ + "" + ParcelList.get(i));
                                }
                            }
                        }
                        else if(menu2 == 4)
                        {
                            int a = 0;
                            int ab = 0;
                            for(int i = 0; i<ParcelList.size(); i++)
                            {
                                ParcelInformation = ParcelList.get(i);
                                if(ParcelInformation.getParcelType().equalsIgnoreCase("Fragile"))
                                {
                                    a++;
                                }
                                else if(ParcelInformation.getParcelType().equalsIgnoreCase("Non-Fragile"))
                                {
                                    ab++;
                                }

                            }
                            System.out.println("Non-Fragile : " + ab++);
                            System.out.println("Fragile : " + a++);
                        }
                        else if(menu2 == 5)
                        {
                            int x = 1;
                            for(int i = 0; i<ParcelList.size(); i++)
                            {
                                ParcelInformation = ParcelList.get(i);
                                if(ParcelInformation.getParcelWeight() > 5.00)
                                {
                                    System.out.println(x++ + "" + ParcelList.get(i));
                                }
                            }
                        }
                        else if(menu2 == 6)
                        {
                            int y = 1;
                            for(int i = 0; i<ParcelList.size(); i++)
                            {
                                ParcelInformation = ParcelList.get(i);
                                if(ParcelInformation.getShippingType().equalsIgnoreCase("Next day Delivery"))
                                {
                                    System.out.println(y++ + "" + ParcelList.get(i));
                                }
                            }
                        }
                    }while (menu2 != 7);
                }
            }while (menu !=5);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}