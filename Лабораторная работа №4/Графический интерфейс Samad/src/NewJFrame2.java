/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samad
 */
public class NewJFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2
     */
    public NewJFrame2() {
        initComponents();
    }

    public static String search(int num, int [] array) {
	boolean check = true;
        return search(num, array, 0, array.length - 1, check);
    }
    private static String search(int num, int [] array, int lo, int hi, boolean check) {
    	int middle;
        if(hi - lo == 1 && check == true) {
            middle = lo + 1;
        }
        else {
            middle = lo + (hi - lo) / 2;
        }
        
        if((middle == 0 || middle == array.length - 1) && num != array[middle]) {
            return "В массиве нет искомого значения";
        }
        else if(num < array[middle]) {
            check = true;
            return search(num, array, lo, middle - 1, check);
	}
	else if(num > array[middle]) {
            check = false;
            return search(num, array, middle + 1, hi, check);
	}
	else  {
            return "Элемент найден на " + middle + "-й позиции";
	}
    }
    
    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
        }
        return array;
    }
    
    int [] firstArray;
    int [] secondArray;
    int size1, size2;
    int sought;
    String arr;
    String find;
    boolean check = true;
    int [] combinedArray;

    
	public void mass(String[] args) {
	  // Сортировка первого массива методом выбора
		for(int i = 0; i < firstArray.length; i++) {
			int min = firstArray[i];
			int minPos = i;
			for(int j = i + 1; j < firstArray.length; j++) {
				if(firstArray[j] < min) {
					min = firstArray[j];
					minPos = j;
				}
			}
			if(i != minPos) {
				int buffer = firstArray[i];
				firstArray[i] = min;
				firstArray[minPos] = buffer;
			}
		}	
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setTitle("Лабораторная работа №2");
        setLocation(new java.awt.Point(800, 400));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Укажите размеры массивов:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Массив 1:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Массив 2:");

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jButton1.setText("Создать");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Поиск элементов в массивах:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("1 Массив");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("2 Массив");

        jButton2.setText("Поиск");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField4.setEnabled(false);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Произвести слияние массивов");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        size1 = Integer.valueOf(jTextField1.getText());
        size2 = Integer.valueOf(jTextField2.getText());
        
        firstArray = createArray(size1);
        secondArray = createArray(size2);
        arr = "Массив 1:\n";
        for(int i = 0; i < size1; i++) {
            arr += firstArray[i] + "  ";
        }
        
        arr += "\n\nМассив 2:\n";
        for(int i = 0; i < size2; i++) {
            arr += secondArray[i] + "  ";
        }
        
        jTextArea2.setText(arr);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sought = Integer.valueOf(jTextField3.getText());
        
        if(jRadioButton1.isSelected()) {
            for(int i = 0; i < firstArray.length; i++) {
			if (firstArray[i] == sought){
				find = "Элемент найден на " + i + "-й позиции";
				break;
			}
			else if (firstArray.length - 1 == i) {
				find = "В массиве нет искомого элемента";
			}
		}
            jTextField4.setText(find);
        }
        
        else if(jRadioButton2.isSelected()) {
            for(int i = 1; i < secondArray.length; i++) {
		int buffer = secondArray[i];
		int j = i - 1;
		while(j >= 0 && buffer < secondArray[j]) {
			secondArray[j + 1] = secondArray[j];
			j--;
		}
		secondArray[j + 1] = buffer;
            }
            find = search(sought,secondArray);
            jTextField4.setText(find);
        }
        
        else {
            jTextField4.setText("Выберите массив для поиска");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for(int i = 0; i < firstArray.length; i++) {
            int min = firstArray[i];
            int minPos = i;
            for(int j = i + 1; j < firstArray.length; j++) {
                if(firstArray[j] < min) {
                    min = firstArray[j];
                    minPos = j;
		}
            }
            if(i != minPos) {
                int buffer = firstArray[i];
		firstArray[i] = min;
		firstArray[minPos] = buffer;
            }
	}	
        
        if(check == true) {
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setText("Назад");
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            jTextField1.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            check = false;
            
            String text = "Массив:\n";
            combinedArray = new int [firstArray.length + secondArray.length];
            for(int i = 0; i < firstArray.length; i++) {
		combinedArray[i] = firstArray[i];
            }
            for(int j = 0, i = firstArray.length; i < firstArray.length + secondArray.length; j++, i++) {
            	combinedArray[i] = secondArray[j];
            }
            for (int i = 0; i < combinedArray.length; i++) {
                text += combinedArray[i] + " ";
            }
            
            
            // Поиск максимального элемента массива
            int dataLength = combinedArray.length, maxDataElem = combinedArray[0];
            for (int i = 0; i < dataLength; i++) {
                if (combinedArray[i] > maxDataElem) {
                    maxDataElem = combinedArray[i];
                }
            }
            
            text += "\nМаксимальный элемент массива: " + maxDataElem;
            
            
            // сумма элементов массива, расположенных до последнего положительного эле¬мента 
                int positiveElem = combinedArray[0], positiveElemIndex = 0;
                for (int i = 0; i < dataLength; i++) {
                    if (combinedArray[i] > 0) {
                        positiveElem = combinedArray[i];
                        positiveElemIndex = i;
                    }
                }
                //System.out.println(positiveElemIndex);
                int sumOfElements = 0;
                for (int i = 0; i < positiveElemIndex; i++) {
                    sumOfElements += combinedArray[i];
                }

                text += "\nСумма элементов до последнего положительного элемента: " + sumOfElements;
                jTextArea2.setText(text);
        }
        
        else {
            jButton1.setVisible(true);
            jButton2.setVisible(true);
            jButton3.setText("Произвести слияние массивов");
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jRadioButton1.setVisible(true);
            jRadioButton2.setVisible(true);
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            check = true;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
