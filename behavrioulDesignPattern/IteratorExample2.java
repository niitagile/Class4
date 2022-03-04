package DesignPattern.behavrioul;
class Alert
{
    String alert;

    public Alert(String alert)
    {
        this.alert = alert;
    }
    public String getAlert()
    {
        return alert;
    }
}
interface CollectionSet
{
    public Iterator createIterator();
}
class AlertCollection implements CollectionSet
{
    static final int MAX_ALERTS = 8;
    int numberOfAlerts = 0;
    Alert[] alertList;

    public AlertCollection()
    {
        alertList = new Alert[MAX_ALERTS];

        addAlert("Alert 1");
        addAlert("Alert 2");
        addAlert("Alert 3");
        addAlert("Alert 4");
        addAlert("Alert 5");
    }

    public void addAlert(String str)
    {
        Alert alert = new Alert(str);
        if (numberOfAlerts >= MAX_ALERTS)
            System.err.println("COMPLETED");
        else
        {
            alertList[numberOfAlerts] = alert;
            numberOfAlerts = numberOfAlerts + 1;
        }
    }

    public Iterator createIterator()
    {
        return new AlertIterator(alertList);
    }
}
interface Iterator
{
    boolean hasNext();
    Object next();
}

    class AlertIterator implements Iterator
    {
        Alert[] alertList;
        int position = 0;

        public  AlertIterator(Alert[] alertList)
        {
            this.alertList = alertList;
        }

        public Object next()
        {
            Alert alert =  alertList[position];
            position += 1;
            return alert;
        }

        public boolean hasNext()
        {
            if (position >= alertList.length ||
                    alertList[position] == null)
                return false;
            else
                return true;
        }
    }

class AlertBar
{
    AlertCollection alerts;

    public AlertBar(AlertCollection alerts)
    {
        this.alerts = alerts;
    }

    public void printAlerts()
    {
        Iterator iterator = alerts.createIterator();
        System.out.println("-------Alert BAR------------");
        while (iterator.hasNext())
        {
            Alert n = (Alert)iterator.next();
            System.out.println(n.getAlert());
        }
    }
}

class IterationExample2{
    public static void main(String[] args) {
        AlertCollection alertCollection = new AlertCollection();
        AlertBar alertBar = new AlertBar(alertCollection);
        alertBar.printAlerts();
    }
}