/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author Ginno Padilla
 */
public class MDIFrame extends javax.swing.JFrame {

    /**
     * Creates new form MDIFrame
     */
    public MDIFrame() {
        initComponents();
        desktopPane.add(login = new Login(this));
        login.setVisible(true);
        this.setVisiblePanel(false);
        initEmployee();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem7 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        desktopPanel = new javax.swing.JPanel();
        salesButton = new javax.swing.JButton();
        pettyCashButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenu();
        newProductMenuItem = new javax.swing.JMenuItem();
        newSupplierMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        newEmployeeMenuItem = new javax.swing.JMenuItem();
        newBranchMenuItem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        newUserMenuItem = new javax.swing.JMenuItem();
        salesMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        logoutMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        viewProductsMenuItem = new javax.swing.JMenuItem();
        viewSuppliersMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        viewEmployeesMenuItem = new javax.swing.JMenuItem();
        viewBranchesMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        viewUsersMenuItem = new javax.swing.JMenuItem();
        accountingMenu = new javax.swing.JMenu();
        payrollMenuItem = new javax.swing.JMenuItem();
        payrollSummaryMenuItem = new javax.swing.JMenuItem();
        ManageMenu = new javax.swing.JMenu();
        transactionBranchMenuItem = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        transactionDailyMenuItem = new javax.swing.JMenuItem();
        transactionMonthlyMenuItem = new javax.swing.JMenuItem();
        transactionYearlyMenuItem = new javax.swing.JMenuItem();
        reportMenu = new javax.swing.JMenu();
        salesSummaryMenuItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        pettyCashMenuItem = new javax.swing.JMenuItem();
        pettyReplenishmentMenuItem = new javax.swing.JMenuItem();
        pettyFundMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(1024, 700));

        salesButton.setText("New Transaction");
        salesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesButtonActionPerformed(evt);
            }
        });

        pettyCashButton.setText("Petty Cash");
        pettyCashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pettyCashButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout desktopPanelLayout = new javax.swing.GroupLayout(desktopPanel);
        desktopPanel.setLayout(desktopPanelLayout);
        desktopPanelLayout.setHorizontalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pettyCashButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        desktopPanelLayout.setVerticalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pettyCashButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        desktopPane.add(desktopPanel);
        desktopPanel.setBounds(10, 10, 133, 74);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        newMenu.setText("New");

        newProductMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newProductMenuItem.setText("Product");
        newProductMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProductMenuItemActionPerformed(evt);
            }
        });
        newMenu.add(newProductMenuItem);

        newSupplierMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        newSupplierMenuItem.setText("Supplier");
        newSupplierMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSupplierMenuItemActionPerformed(evt);
            }
        });
        newMenu.add(newSupplierMenuItem);
        newMenu.add(jSeparator4);

        newEmployeeMenuItem.setText("Employee");
        newEmployeeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEmployeeMenuItemActionPerformed(evt);
            }
        });
        newMenu.add(newEmployeeMenuItem);

        newBranchMenuItem.setText("Branch");
        newBranchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBranchMenuItemActionPerformed(evt);
            }
        });
        newMenu.add(newBranchMenuItem);
        newMenu.add(jSeparator5);

        newUserMenuItem.setText("User");
        newUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserMenuItemActionPerformed(evt);
            }
        });
        newMenu.add(newUserMenuItem);

        fileMenu.add(newMenu);

        salesMenuItem.setText("Sales");
        salesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(salesMenuItem);
        fileMenu.add(jSeparator1);

        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(logoutMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        viewMenu.setMnemonic('v');
        viewMenu.setText("View");

        viewProductsMenuItem.setText("Products");
        viewProductsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductsMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(viewProductsMenuItem);

        viewSuppliersMenuItem.setText("Suppliers");
        viewSuppliersMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSuppliersMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(viewSuppliersMenuItem);
        viewMenu.add(jSeparator2);

        viewEmployeesMenuItem.setText("Employees");
        viewEmployeesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmployeesMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(viewEmployeesMenuItem);

        viewBranchesMenuItem.setText("Branches");
        viewBranchesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBranchesMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(viewBranchesMenuItem);
        viewMenu.add(jSeparator3);

        viewUsersMenuItem.setText("Users");
        viewUsersMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUsersMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(viewUsersMenuItem);

        menuBar.add(viewMenu);

        accountingMenu.setText("Accounting");

        payrollMenuItem.setText("Payroll");
        payrollMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrollMenuItemActionPerformed(evt);
            }
        });
        accountingMenu.add(payrollMenuItem);

        payrollSummaryMenuItem.setText("Payroll Summary");
        payrollSummaryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrollSummaryMenuItemActionPerformed(evt);
            }
        });
        accountingMenu.add(payrollSummaryMenuItem);

        menuBar.add(accountingMenu);

        ManageMenu.setMnemonic('m');
        ManageMenu.setText("Manage");

        transactionBranchMenuItem.setText("Branch Transactions");
        ManageMenu.add(transactionBranchMenuItem);
        ManageMenu.add(jSeparator6);

        transactionDailyMenuItem.setText("Daily Transactions");
        ManageMenu.add(transactionDailyMenuItem);

        transactionMonthlyMenuItem.setText("Monthly Transactions");
        ManageMenu.add(transactionMonthlyMenuItem);

        transactionYearlyMenuItem.setText("Yearly Transactions");
        transactionYearlyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionYearlyMenuItemActionPerformed(evt);
            }
        });
        ManageMenu.add(transactionYearlyMenuItem);

        menuBar.add(ManageMenu);

        reportMenu.setMnemonic('r');
        reportMenu.setText("Reports");

        salesSummaryMenuItem.setText("Sales Summary");
        reportMenu.add(salesSummaryMenuItem);

        jMenuItem2.setText("Sales Deposit");
        reportMenu.add(jMenuItem2);
        reportMenu.add(jSeparator8);

        jMenuItem1.setText("Master Inventory");
        reportMenu.add(jMenuItem1);
        reportMenu.add(jSeparator7);

        pettyCashMenuItem.setText("Petty Cash / Check Voucher");
        pettyCashMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pettyCashMenuItemActionPerformed(evt);
            }
        });
        reportMenu.add(pettyCashMenuItem);

        pettyReplenishmentMenuItem.setText("Petty Cash Replenishment");
        pettyReplenishmentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pettyReplenishmentMenuItemActionPerformed(evt);
            }
        });
        reportMenu.add(pettyReplenishmentMenuItem);

        pettyFundMenuItem.setText("Petty Cash Fund");
        reportMenu.add(pettyFundMenuItem);

        menuBar.add(reportMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(login = new Login(this));
        login.setVisible(true);
        System.out.println("Logout successful.");
        this.setVisiblePanel(false);
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void viewProductsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductsMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(manageProduct = new UI.Product.Manage(this));
        manageProduct.setVisible(true);
    }//GEN-LAST:event_viewProductsMenuItemActionPerformed

    private void payrollSummaryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrollSummaryMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(summaryPayroll = new UI.Payroll.Summary(this));
        summaryPayroll.setVisible(true);    
    }//GEN-LAST:event_payrollSummaryMenuItemActionPerformed

    private void transactionYearlyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionYearlyMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionYearlyMenuItemActionPerformed

    private void newProductMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProductMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(createProduct = new UI.Product.Create(this));
        createProduct.setVisible(true);
    }//GEN-LAST:event_newProductMenuItemActionPerformed

    private void newEmployeeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmployeeMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(createEmployee = new UI.Employee.Create());
        createEmployee.setVisible(true);
    }//GEN-LAST:event_newEmployeeMenuItemActionPerformed

    private void viewEmployeesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmployeesMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(viewEmployee = new UI.Employee.View(this));
        viewEmployee.setVisible(true);
    }//GEN-LAST:event_viewEmployeesMenuItemActionPerformed

    private void viewBranchesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBranchesMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(viewBranch = new UI.Branch.Manage(this));
        viewBranch.setVisible(true);
    }//GEN-LAST:event_viewBranchesMenuItemActionPerformed

    private void newBranchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBranchMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(createBranch = new UI.Branch.Create(this));
        createBranch.setVisible(true);
    }//GEN-LAST:event_newBranchMenuItemActionPerformed

    private void newUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(createUser = new UI.User.Create(this));
        createUser.setVisible(true);
    }//GEN-LAST:event_newUserMenuItemActionPerformed

    private void viewUsersMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUsersMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(viewUser = new UI.User.View(this));
        viewUser.setVisible(true);
    }//GEN-LAST:event_viewUsersMenuItemActionPerformed

    private void payrollMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrollMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(managePayroll = new UI.Payroll.Manage(this));
        managePayroll.setVisible(true);
    }//GEN-LAST:event_payrollMenuItemActionPerformed

    private void newSupplierMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSupplierMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(createSupplier = new UI.Supplier.Create(this));
        createSupplier.setVisible(true);
    }//GEN-LAST:event_newSupplierMenuItemActionPerformed

    private void viewSuppliersMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSuppliersMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(viewSupplier = new UI.Supplier.View(this));
        viewSupplier.setVisible(true);
    }//GEN-LAST:event_viewSuppliersMenuItemActionPerformed

    private void salesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesMenuItemActionPerformed
        // TODO add your handling code here:
        this.setVisiblePanel(true);
    }//GEN-LAST:event_salesMenuItemActionPerformed

    private void pettyCashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pettyCashButtonActionPerformed
        // TODO add your handling code here:
        desktopPane.add(setupPettyCash = new UI.PettyCash.Setup(this));
        setupPettyCash.setVisible(true);
    }//GEN-LAST:event_pettyCashButtonActionPerformed

    private void pettyReplenishmentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pettyReplenishmentMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(replenishmentPettyCash = new UI.PettyCash.Replenishment());
        replenishmentPettyCash.setVisible(true);
    }//GEN-LAST:event_pettyReplenishmentMenuItemActionPerformed

    private void pettyCashMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pettyCashMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.add(setupPettyCash = new UI.PettyCash.Setup(this));
        setupPettyCash.setVisible(true);
    }//GEN-LAST:event_pettyCashMenuItemActionPerformed

    private void salesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesButtonActionPerformed
        // TODO add your handling code here:
        desktopPane.add(newSales = new UI.Sales.New());
        newSales.setVisible(true);
    }//GEN-LAST:event_salesButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ManageMenu;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenu accountingMenu;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JPanel desktopPanel;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newBranchMenuItem;
    private javax.swing.JMenuItem newEmployeeMenuItem;
    private javax.swing.JMenu newMenu;
    private javax.swing.JMenuItem newProductMenuItem;
    private javax.swing.JMenuItem newSupplierMenuItem;
    private javax.swing.JMenuItem newUserMenuItem;
    private javax.swing.JMenuItem payrollMenuItem;
    private javax.swing.JMenuItem payrollSummaryMenuItem;
    private javax.swing.JButton pettyCashButton;
    private javax.swing.JMenuItem pettyCashMenuItem;
    private javax.swing.JMenuItem pettyFundMenuItem;
    private javax.swing.JMenuItem pettyReplenishmentMenuItem;
    private javax.swing.JMenu reportMenu;
    private javax.swing.JButton salesButton;
    private javax.swing.JMenuItem salesMenuItem;
    private javax.swing.JMenuItem salesSummaryMenuItem;
    private javax.swing.JMenuItem transactionBranchMenuItem;
    private javax.swing.JMenuItem transactionDailyMenuItem;
    private javax.swing.JMenuItem transactionMonthlyMenuItem;
    private javax.swing.JMenuItem transactionYearlyMenuItem;
    private javax.swing.JMenuItem viewBranchesMenuItem;
    private javax.swing.JMenuItem viewEmployeesMenuItem;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JMenuItem viewProductsMenuItem;
    private javax.swing.JMenuItem viewSuppliersMenuItem;
    private javax.swing.JMenuItem viewUsersMenuItem;
    // End of variables declaration//GEN-END:variables
    private Login login;
    //UI.Employee
    private UI.Employee.Create createEmployee;
    private UI.Employee.Update updateEmployee;
    private UI.Employee.View viewEmployee;
    //UI.Branch
    private UI.Branch.Create createBranch;
    private UI.Branch.Update updateBranch;
    private UI.Branch.Manage viewBranch;
    //UI.User
    private UI.User.Create createUser;
    private UI.User.Update updateUser;
    private UI.User.View viewUser;
    //UI.Payroll
    private UI.Payroll.Manage managePayroll;
    private UI.Payroll.Summary summaryPayroll;
    //UI.Supplier
    private UI.Supplier.Create createSupplier;
    private UI.Supplier.Update updateSupplier;
    private UI.Supplier.View viewSupplier;
    //UI.Product
    private UI.Product.Create createProduct;
    private UI.Product.Manage manageProduct;
    private UI.Product.Update updateProduct;
    //UI.PettyCash
    private UI.PettyCash.Setup setupPettyCash;
    private UI.PettyCash.Fund fundPettyCash;
    private UI.PettyCash.Replenishment replenishmentPettyCash;
    //UI.Sales
    private UI.Sales.New newSales;
    private UI.Sales.Manage manageSales;
    private UI.Sales.Summary summarySales;
    private UI.Sales.Deposit depositSales;
    
    public void setVisiblePanel(boolean val){
        this.desktopPanel.setVisible(val);
    }
    
    protected void initEmployee(){
        System.out.println("Employee initialized.");
    }
    
    public void updateEmployeeAction(){
        desktopPane.add(updateEmployee = new UI.Employee.Update());
        updateEmployee.setVisible(true);
    }
    
    public void updateBranchAction(){
        desktopPane.add(updateBranch = new UI.Branch.Update());
        updateBranch.setVisible(true);
    }

    public void updateSupplierAction() {
        desktopPane.add(updateSupplier = new UI.Supplier.Update());
        updateSupplier.setVisible(true);
    }

    public void updateUserAction() {
        desktopPane.add(updateUser = new UI.User.Update(this));
        updateUser.setVisible(true);
    }
}
