public class ParcelInformation {

    String TrackingNumber;
    String SenderName;
    String RecipientName;
    String SenderAddress;
    String RecipientAddress;
    int PostcodeTo;
    int PostcodeFrom;
    double ParcelWeight;
    double ParcelLength;
    double ParcelHeight;
    String ShippingType;
    String ParcelType;
    String ShippingCategory;
    String ShippingDate;
    String DeliveryDate;

    ParcelInformation(){

    }

    public ParcelInformation(String trackingNumber, String senderName, String recipientName, String senderAddress, String recipientAddress, int postcodeTo, int postcodeFrom, double parcelWeight, double parcelLength,
                             double parcelHeight, String shippingType, String parcelType, String shippingCategory, String shippingDate, String deliveryDate) {
        TrackingNumber = trackingNumber;
        SenderName = senderName;
        RecipientName = recipientName;
        SenderAddress = senderAddress;
        RecipientAddress = recipientAddress;
        PostcodeTo = postcodeTo;
        PostcodeFrom = postcodeFrom;
        ParcelWeight = parcelWeight;
        ParcelLength = parcelLength;
        ParcelHeight = parcelHeight;
        ShippingType = shippingType;
        ParcelType = parcelType;
        ShippingCategory = shippingCategory;
        ShippingDate = shippingDate;
        DeliveryDate = deliveryDate;
    }

    public void setTrackingNumber(String trackingNumber) {TrackingNumber = trackingNumber;}
    public void setSenderName(String senderName) {SenderName = senderName;}
    public void setRecipientName(String recipientName) {RecipientName = recipientName;}
    public void setSenderAddress(String senderAddress) {
        SenderAddress = senderAddress;}
    public void setRecipientAddress(String recipientAddress) {
        RecipientAddress = recipientAddress;}
    public void setPostcodeTo(int postcodeTo) {PostcodeTo = postcodeTo;}
    public void setPostcodeFrom(int postcodeFrom) {PostcodeFrom = postcodeFrom;}
    public void setParcelWeight(double parcelWeight) {ParcelWeight = parcelWeight;}
    public void setParcelLength(double parcelLength) {
        ParcelLength = parcelLength;}
    public void setParcelHeight(double parcelHeight) {ParcelHeight = parcelHeight;}
    public void setShippingType(String shippingType) {ShippingType = shippingType;}
    public void setParcelType(String parcelType) {ParcelType = parcelType;}
    public void setShippingCategory(String shippingCategory) {ShippingCategory = shippingCategory;}
    public void setShippingDate(String shippingDate) {ShippingDate = shippingDate;}
    public void setDeliveryDate(String deliveryDate) {DeliveryDate = deliveryDate;}

    public String getTrackingNumber() {return TrackingNumber;}
    public String getSenderName() {return SenderName;}
    public String getRecipientName() {return RecipientName;}
    public String getSenderAddress() {return SenderAddress;}
    public String getRecipientAddress() {return RecipientAddress;}
    public int getPostcodeTo() {return PostcodeTo;}
    public int getPostcodeFrom() {return PostcodeFrom;}
    public double getParcelWeight() {return ParcelWeight;}
    public double getParcelLength() {return ParcelLength;}
    public double getParcelHeight() {return ParcelHeight;}
    public String getShippingType() {return ShippingType;}
    public String getParcelType() {return ParcelType;}
    public String getShippingCategory() {return ShippingCategory;}
    public String getShippingDate() {return ShippingDate;}
    public String getDeliveryDate() {return DeliveryDate;}

    double CalculateShippingRate(String ShippingCategory, String ShippingType) {
        double ShippingRate = 0;
        if (ShippingCategory.equalsIgnoreCase("International")) {
            ShippingRate = ParcelWeight * 50.00;
        }
        if (ShippingCategory.equalsIgnoreCase("Domestic")) {
            ShippingRate = ParcelWeight * 7.00;
        }
        if(ShippingType.equalsIgnoreCase("Next day Delivery") && ShippingCategory.equalsIgnoreCase("Domestic")) {
            ShippingRate = ParcelWeight * 7.00 + 10.00;
        }
        return ShippingRate;
    }

    public String toString() {
        return "\n\nParcelInformation{" +
                "\nTrackingNumber ='" + getTrackingNumber() + '\'' +
                "\nSender Name ='" + getSenderName() + '\'' +
                "\nRecipient Name ='" + getRecipientName() + '\'' +
                "\nSenderAddress ='" + getSenderAddress() + '\'' +
                "\nRecipient Address ='" + getRecipientAddress() + '\'' +
                "\nPostcode To =" + getPostcodeTo() +
                "\nPostcode From =" + getPostcodeFrom() +
                "\nParcel Weight =" + getParcelWeight() +
                "\nParcel Length =" + getParcelLength() +
                "\nParcel Height =" + getParcelHeight() +
                "\nShipping Type ='" + getShippingType() + '\'' +
                "\nParcel Type ='" + getParcelType() + '\'' +
                "\nShipping Category ='" + getShippingCategory() + '\'' +
                "\nShipping Date = '" + getShippingDate() + '\'' +
                "\nDeliveryDate =" + getDeliveryDate() + "\n\n";
    }
}