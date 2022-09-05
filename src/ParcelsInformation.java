public class ParcelsInformation {
    String TrackingNumber, SenderName, RecipientName, SenderAddress, RecipientAddress, ShippingType, ParcelType, ShippingCategory, ShippingDate, DeliveryDate;
    int PostcodeTo, PostcodeFrom;
    double ParcelWeight, ParcelLength, ParcelHeight;

    public ParcelsInformation(){ //Default Constructor
        TrackingNumber = null;
        SenderName = null;
        RecipientName = null;
        SenderAddress = null;
        RecipientAddress = null;
        PostcodeTo = 0;
        PostcodeFrom = 0;
        ParcelWeight = 0.0;
        ParcelLength = 0.0;
        ParcelHeight = 0.0;
        ShippingType = null;
        ParcelType = null;
        ShippingCategory = null;
        ShippingDate = null;
        DeliveryDate = null;

    }
    public ParcelsInformation( String TrackingNumber, String SenderName, String RecipientName, String SenderAddress, String RecipientAddress,  int PostcodeTo, int PostcodeFrom, double ParcelWeight, double ParcelLength, double ParcelHeight, String ShippingType, String ParcelType,
                              String ShippingCategory, String ShippingDate, String DeliveryDate){ //Normal Constructor
        this.TrackingNumber = TrackingNumber;
        this.SenderName = SenderName;
        this.RecipientName = RecipientName;
        this.SenderAddress = SenderAddress;
        this.RecipientAddress = RecipientAddress;
        this.PostcodeTo = PostcodeTo;
        this.PostcodeFrom = PostcodeFrom;
        this.ParcelWeight = ParcelWeight;
        this.ParcelLength = ParcelLength;
        this.ParcelHeight = ParcelHeight;
        this.ShippingType = ShippingType;
        this.ParcelType = ParcelType;
        this.ShippingCategory = ShippingCategory;
        this.ShippingDate = ShippingDate;
        this.DeliveryDate = DeliveryDate;

    }
    public void setParcelInfo( String TrackingNumber, String SenderName, String RecipientName, String SenderAddress, String RecipientAddress,  int PostcodeTo, int PostcodeFrom, double ParcelWeight, double ParcelLength, double ParcelHeight, String ShippingType, String ParcelType,
                               String ShippingCategory, String ShippingDate, String DeliveryDate){ //Normal Constructor
        this.TrackingNumber = TrackingNumber;
        this.SenderName = SenderName;
        this.RecipientName = RecipientName;
        this.SenderAddress = SenderAddress;
        this.RecipientAddress = RecipientAddress;
        this.PostcodeTo = PostcodeTo;
        this.PostcodeFrom = PostcodeFrom;
        this.ParcelWeight = ParcelWeight;
        this.ParcelLength = ParcelLength;
        this.ParcelHeight = ParcelHeight;
        this.ShippingType = ShippingType;
        this.ParcelType = ParcelType;
        this.ShippingCategory = ShippingCategory;
        this.ShippingDate = ShippingDate;
        this.DeliveryDate = DeliveryDate;
    }
    //Mutator for each attributes
    public void setTrackingNumber(String trackingNumber) {TrackingNumber = trackingNumber;}
    public void setSenderName(String senderName) {SenderName = senderName;}
    public void setRecipientName(String recipientName) {RecipientName = recipientName;}
    public void setSenderAddress(String senderAddress) {SenderAddress = senderAddress;}
    public void setRecipientAddress(String recipientAddress) {RecipientAddress = recipientAddress;}
    public void setParcelWeight(double parcelWeight) {ParcelWeight = parcelWeight;}
    public void setParcelLength(double parcelLength) {ParcelLength = parcelLength;}
    public void setParcelHeight(double parcelHeight) {ParcelHeight = parcelHeight;}
    public void setShippingType(String shippingType) {ShippingType = shippingType;}
    public void setParcelType(String parcelType) {ParcelType = parcelType;}
    public void setShippingCategory(String shippingCategory) {ShippingCategory = shippingCategory; }
    public void setShippingDate(String shippingDate) {ShippingDate = shippingDate;}
    public void setDeliveryDate(String deliveryDate) {DeliveryDate = deliveryDate;}
    public void setPostcodeTo(int postcodeTo) {PostcodeTo = postcodeTo;}
    public void setPostcodeFrom(int postcodeFrom) {PostcodeFrom = postcodeFrom;}

    public String getTrackingNumber() {return TrackingNumber;}
    public String getSenderName() {return SenderName;}
    public String getRecipientName() {return RecipientName;}
    public String getSenderAddress() {return SenderAddress;}
    public String getRecipientAddress() {return RecipientAddress;}
    public double getParcelWeight() {return ParcelWeight;}
    public double getParcelLength() {return ParcelLength;}
    public double getParcelHeight() {return ParcelHeight;}
    public String isShippingType() {return ShippingType;}
    public String isParcelType() {return ParcelType;}
    public String isShippingCategory() {return ShippingCategory;}
    public String getShippingDate() {return ShippingDate;}
    public String getDeliveryDate() {return DeliveryDate;}
    public int getPostcodeTo() {return PostcodeTo;}
    public int getPostcodeFrom() {return PostcodeFrom;}

    public double CalculateShippingRate() {
        double ShippingRate = 0;
        if(ShippingCategory.equalsIgnoreCase("International")){
            ShippingRate = getParcelWeight() * 50.0;
        }
        if(ShippingCategory.equalsIgnoreCase("Domestic")){
            ShippingRate = getParcelWeight() * 7.0;
        }if(ShippingCategory.equalsIgnoreCase("Next day Delivery") && ShippingCategory.equalsIgnoreCase("Domestic")){
            ShippingRate = getParcelWeight() * 7.0 + 10.0;
        }
        return ShippingRate;
    }

    public String toString() {
        return "ParcelsInformation{" +
                "\n SenderName='" + SenderName + '\'' +
                "\n RecipientName='" + RecipientName + '\'' +
                "\n SenderAddress='" + SenderAddress + '\'' +
                "\n RecipientAddress='" + RecipientAddress + '\'' +
                "\nParcelWeight=" + ParcelWeight +
                "\nParcelLength=" + ParcelLength +
                "\nParcelHeight=" + ParcelHeight +
                "\nShippingRate=" + CalculateShippingRate() +
                "\nShippingType=" + ShippingType +
                "\nParcelType=" + ParcelType +
                "\nShippingCategory=" + ShippingCategory +
                "\nTrackingNumber=" + TrackingNumber +
                "\nShippingDate=" + ShippingDate +
                "\nDeliveryDate=" + DeliveryDate +
                "\nPostcodeTo=" + PostcodeTo +
                "\nPostcodeFrom=" + PostcodeFrom +
                "\ntrackingNumber=" + getTrackingNumber() +
                "\nsenderName='" + getSenderName() + '\'' +
                "\nrecipientName='" + getRecipientName() + '\'' +
                "\nsenderAddress='" + getSenderAddress() + '\'' +
                "\nrecipientAddress='" + getRecipientAddress() + '\'' +
                "\nparcelWeight=" + getParcelWeight() +
                "\nparcelLength=" + getParcelLength() +
                "\nparcelHeight=" + getParcelHeight() +
                "\nshippingType=" + isShippingType() +
                "\nparcelType=" + isParcelType() +
                "\nshippingCategory=" + isShippingCategory() +
                "\nshippingDate=" + getShippingDate() +
                "\ndeliveryDate=" + getDeliveryDate() +
                "\npostcodeTo=" + getPostcodeTo() +
                "\npostcodeFrom=" + getPostcodeFrom() +
                "\nCalculateShippingRate=" + CalculateShippingRate() +
                '}';
    }
}
