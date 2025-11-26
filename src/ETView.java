import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;

import java.awt.event.*;
import javax.swing.event.*;

public class ETView {
    
    private JFrame frame = new JFrame();
    private JSeparator line = new JSeparator();
    private JPanel top = new JPanel();
    private JLabel welcome = new JLabel();
    private JButton addBankButton = new JButton("Add Bank");

    private JLabel cashExpenseLabel = new JLabel("Cash Expenses");
    private JLabel digiExpenseLabel = new JLabel("Digital Expenses");
    private JLabel budgetLabel = new JLabel("Budgets");

    private String[] cashExpenseColumns = {"ID", "Date", "Amount", "Category"};
    private String[] digiExpenseColumns = {"ID", "Date", "Amount", "Category", "Bank", "RefNum"};
    private String[] budgetColumns = {"ID", "Amount", "Start Date", "End Date", "Category"};

    /* SAMPLE DATA OBJECTS */
    private Object[][] cashExpenseData = {
        {"001", "2025-10-01", 200.50, "Food"},
        {"002", "2025-10-01", 100.00, "Transporation"},
        {"002", "2025-10-01", 100.00, "Transporation"},
        {"002", "2025-10-01", 100.00, "Transporation"},
        {"002", "2025-10-01", 100.00, "Transporation"},
        {"002", "2025-10-01", 100.00, "Transporation"},
        {"002", "2025-10-01", 100.00, "Transporation"},
        {"002", "2025-10-01", 100.00, "Transporation"},
        {"002", "2025-10-01", 100.00, "Transporation"},
        {"002", "2025-10-01", 100.00, "Transporation"},
        {"002", "2025-10-01", 100.00, "Transporation"},
        {"002", "2025-10-01", 100.00, "Transporation"},
        {"002", "2025-10-01", 100.00, "Transporation"},
        {"002", "2025-10-01", 100.00, "Transporation"},
        {"002", "2025-10-01", 100.00, "Transporation"}
    };

    private Object[][] digiExpenseData = {
        {"003", "2025-10-05", 175.25, "Shopping", "GCash", "123456789"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"},
        {"004", "2025-10-05", 300.25, "Shopping", "BPI", "789456123"}
    };

    private Object[][] budgetData = {
        {"001", 1000.00, "2025-10-01", "2025-10-31",  "Food"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},
        {"002", 500.00, "2025-10-01", "2025-10-31",  "Transportation"},

    };

    private JTable cashExpenseTable = new JTable(cashExpenseData, cashExpenseColumns);
    private JTable digiExpenseTable = new JTable(digiExpenseData, digiExpenseColumns);
    private JTable budgetTable = new JTable(budgetData, budgetColumns);

    private JScrollPane ceSP; 
    private JScrollPane deSP;
    private JScrollPane bSP;

    private JButton addCashExpenseButton = new JButton("Add Cash Expense");
    private JButton addDigitalExpenseButton = new JButton("Add Digital Expense");
    private JButton viewInsightsButton = new JButton("View Insights");
    private JButton viewCategoriesButton = new JButton("View Categories");
    private JButton addBudgetButton = new JButton("Add Budget Expense");

    


    Font heading = new Font("Arial", Font.BOLD, 24);
    Font body = new Font("Arial", Font.PLAIN, 18);
    Font fontTable = new Font("Arial", Font.PLAIN, 16);


    public ETView(){
        

        /* TOP PANEL COMPONENTS */
        line.setOrientation(SwingConstants.HORIZONTAL); 

    
        welcome.setBounds(27, 20, 400, 28);
        welcome.setText("Welcome, User");
        welcome.setFont(heading);

        addBankButton.setBounds(900, 12, 147, 39);
        addBankButton.setFont(body);
        addBankButton.setFocusable(false);
        

        top.setBounds(0, 0, 1080, 64);
        top.setLayout(new BorderLayout());
        top.add(line, BorderLayout.SOUTH); 

        /* TABLE LABELS */
        cashExpenseLabel.setBounds(42, 77, 215, 32);
        cashExpenseLabel.setFont(heading);

        digiExpenseLabel.setBounds(42, 344, 200, 27);
        digiExpenseLabel.setFont(heading);

        budgetLabel.setBounds(605, 77, 132, 32);
        budgetLabel.setFont(heading);

        /* MAIN FUNCTION BUTTONS */
        addCashExpenseButton.setBounds(49, 585, 232, 39);
        addCashExpenseButton.setFont(body);
        addCashExpenseButton.setFocusable(false);

        addDigitalExpenseButton.setBounds(291, 585, 232, 39);
        addDigitalExpenseButton.setFont(body);
        addDigitalExpenseButton.setFocusable(false);

        viewInsightsButton.setBounds(49, 632, 232, 39); 
        viewInsightsButton.setFont(body);
        viewInsightsButton.setFocusable(false);

        viewCategoriesButton.setBounds(291, 632, 232, 39); 
        viewCategoriesButton.setFont(body);
        viewCategoriesButton.setFocusable(false);

        addBudgetButton.setBounds(689, 585, 232, 39);
        addBudgetButton.setFont(body);
        addBudgetButton.setFocusable(false);


        /* TABLES */
        //note for making the gui: put setBounds() on the scrollPane, not the table.
        cashExpenseTable.setFont(fontTable);
        ceSP  = new JScrollPane(cashExpenseTable);
        ceSP.setBounds(42, 109, 499, 197);
        frame.add(ceSP);

        digiExpenseTable.setFont(fontTable);
        digiExpenseTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        digiExpenseTable.getColumnModel().getColumn(1).setPreferredWidth(90);
        digiExpenseTable.getColumnModel().getColumn(5).setPreferredWidth(90);
        deSP = new JScrollPane(digiExpenseTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        deSP.setBounds(42, 374, 499, 197);
        frame.add(deSP);

        budgetTable.setFont(fontTable);
        budgetTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        budgetTable.getColumnModel().getColumn(2).setPreferredWidth(90);
        budgetTable.getColumnModel().getColumn(3).setPreferredWidth(90);
        budgetTable.getColumnModel().getColumn(4).setPreferredWidth(90);
        bSP  = new JScrollPane(budgetTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        bSP.setBounds(605, 109, 394, 463);
        frame.add(bSP);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setLayout(null);

        frame.add(welcome);
        frame.add(addBankButton);
        frame.add(cashExpenseLabel);
        frame.add(digiExpenseLabel);
        frame.add(budgetLabel);
        frame.add(addCashExpenseButton);
        frame.add(addDigitalExpenseButton);
        frame.add(viewInsightsButton);
        frame.add(viewCategoriesButton);
        frame.add(addBudgetButton);

    

        frame.add(top);


        frame.setVisible(true);
    }

    

}
