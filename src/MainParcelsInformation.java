import javax.swing.*;
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

/*public class MainParcelsInformation {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Courier.txt"));
            ArrayList<ParcelsInformation> parcelList = new ArrayList<>();
            ParcelsInformation ParcelsInformation;
            String line = null;

            while ((line = reader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ",");
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
                String ShippingCategory = st.nextToken();
                String ShippingDate = st.nextToken();
                String DeliveryDate = st.nextToken();


                ParcelsInformation = new ParcelsInformation(TrackingNumber,SenderName, RecipientName,SenderAddress,RecipientAddress,PostcodeTo, PostcodeFrom, ParcelWeight,ParcelLength, ParcelHeight, ShippingType, ParcelType, ShippingCategory, ShippingDate, DeliveryDate);
                parcelList.add(ParcelsInformation);
            }
            reader.close();

            int menu = 0;
            do {
                menu = Integer.parseInt(JOptionPane.showInputDialog("Do you want to : " + "\n1.Add \n2.Update \n3.Delete \n4.Display \n5.Exit"));

                if (menu == 1) {
                    String SenderName = JOptionPane.showInputDialog("Enter Sender Name : ");
                    String RecipientName = JOptionPane.showInputDialog("Enter Recipient Name : ");
                    String SenderAddress = JOptionPane.showInputDialog("Enter Sender Address : ");
                    String RecipientAddress = JOptionPane.showInputDialog("Enter Recipient Address : ");
                    double ParcelWeight = Double.parseDouble(JOptionPane.showInputDialog("Enter Parcel Weight : "));
                    double ParcelLength = Double.parseDouble(JOptionPane.showInputDialog("Enter Parcel Length : "));
                    double ParcelHeight = Double.parseDouble(JOptionPane.showInputDialog("Enter Parcel Height : "));
                    String ShippingType = JOptionPane.showInputDialog("Enter Shipping Type : ");
                    String ParcelType = JOptionPane.showInputDialog("Enter Parcel Type : ");
                    String ShippingCategory = JOptionPane.showInputDialog("Enter Shipping Category : ");
                    String TrackingNumber = JOptionPane.showInputDialog("Enter Tracking Number : ");
                    String ShippingDate = JOptionPane.showInputDialog("Enter Shipping Date : ");
                    String DeliveryDate = JOptionPane.showInputDialog("Enter Delivery Date : ");
                    int PostcodeTo = Integer.parseInt(JOptionPane.showInputDialog("Enter PostCode To : "));
                    int PostcodeFrom = Integer.parseInt(JOptionPane.showInputDialog("Enter Postcode From : "));
                    ParcelsInformation = new ParcelsInformation(TrackingNumber,SenderName, RecipientName,SenderAddress,RecipientAddress,PostcodeTo, PostcodeFrom, ParcelWeight,ParcelLength, ParcelHeight, ShippingType, ParcelType, ShippingCategory, ShippingDate, DeliveryDate);
                    parcelList.add(ParcelsInformation);


                } else if (menu == 2) {
                    String TrackNum = JOptionPane.showInputDialog("Enter the Tracking Number for the Parcel to Delete the Data");
                    for (int i = 0; i < parcelList.size(); i++) {
                        ParcelsInformation = parcelList.get(i);
                        if (ParcelsInformation.getTrackingNumber().equalsIgnoreCase(TrackNum)) {
                            parcelList.remove(ParcelsInformation);
                        }
                    }
                } else if (menu == 3) {
                    String TrackNum = JOptionPane.showInputDialog("Enter the Tracking Number to delete its data");
                    for (int i = 0; i < parcelList.size(); i++) {
                        ParcelsInformation = parcelList.get(i);
                        {
                            String DelivDate = JOptionPane.showInputDialog("Enter the new Delivery Date");
                            ParcelsInformation.setDeliveryDate(DelivDate);
                            parcelList.set(i, ParcelsInformation);
                        }
                    }
                } else if (menu == 4) {
                    int menu2 = 0;
                    do {
                        menu2 = Integer.parseInt(JOptionPane.showInputDialog("Choose to display \n Enter 1 For Display ALL Parcel \n Enter 2 For Display Domestic Only \n Enter 3 For International Only \n Enter 4 For Display Count Fragile & Non-Fragile \n Enter 5 For Display Large Parcel More than 5kg \n Enter 6 For Display Parcel that Delivered on the next day \n Enter 7 For Main Menu"));
                        if (menu2 == 1) {
                            int x = 1;
                            for (int i = 0; i < parcelList.size(); i++) {
                                System.out.println(x++ + "\n" + parcelList.toString());
                            }
                        } else if (menu2 == 2) {
                            int y = 1;
                            for (int i = 0; i < parcelList.size(); i++) {
                                ParcelsInformation = parcelList.get(i);
                                if (ParcelsInformation.isShippingCategory().equalsIgnoreCase("Domestic")) {
                                    System.out.println(y++ + "" + parcelList.get(i));
                                }
                            }
                        } else if (menu2 == 3) {
                            int z = 1;
                            for (int i = 0; i < parcelList.size(); i++) {
                                ParcelsInformation = parcelList.get(i);
                                if (ParcelsInformation.isShippingCategory().equalsIgnoreCase("International")) {
                                    System.out.println(z++ + "" + parcelList.get(i));
                                }
                            }
                        } else if (menu2 == 4) {
                            int a = 0;
                            int ab = 0;
                            for (int i = 0; i < parcelList.size(); i++) {
                                ParcelsInformation = parcelList.get(i);
                                if (ParcelsInformation.isParcelType().equalsIgnoreCase("Fragile")) {
                                    a++;
                                } else if (ParcelsInformation.isParcelType().equalsIgnoreCase("Non-Fragile")) {
                                    ab++;
                                }

                            }
                            System.out.println("Non-Fragile : " + ab++);
                            System.out.println("Fragile : " + a++);
                        } else if (menu2 == 5) {
                            int b = 1;
                            for (int i = 0; i < parcelList.size(); i++) {
                                ParcelsInformation = parcelList.get(i);
                                if (ParcelsInformation.getParcelWeight() > 5.00) {
                                    System.out.println(b++ + "" + parcelList.get(i));
                                }
                            }
                        } else if (menu2 == 6) {
                            int c = 1;
                            for (int i = 0; i < parcelList.size(); i++) {
                                ParcelsInformation = parcelList.get(i);
                                if (ParcelsInformation.getShippingDate().equalsIgnoreCase("Next Day Delivery")) {
                                    System.out.println(c++ + "" + parcelList.get(i));
                                }
                            }
                        }
                    } while (menu2 != 7);
                }
            }while (menu != 5);
        } catch (EOFException ex) {
            System.out.println(ex.getMessage());
        }
        }
    }*/

