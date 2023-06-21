/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import Model.Clases.Juego;
import Model.Enums.EJuegos;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paola
 */
public class vistaListarJuegos extends javax.swing.JPanel {
    
    private ArrayList<Juego> juegos;

    /**
     * Creates new form vistaComprar
     */
    public vistaListarJuegos(ArrayList<Juego> juegos) {
        this.juegos=juegos;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fondoBarraSuperior = new javax.swing.JPanel();
        fondoPanelAccion = new javax.swing.JPanel();
        textoAccion = new javax.swing.JLabel();
        fondoPanelAventura = new javax.swing.JPanel();
        textoAventura = new javax.swing.JLabel();
        fondoPanelDeRol = new javax.swing.JPanel();
        textoDeRol = new javax.swing.JLabel();
        fondoPanelSimulacion = new javax.swing.JPanel();
        textoSimulacion = new javax.swing.JLabel();
        fondoPanelDeportes = new javax.swing.JPanel();
        textoDeportes = new javax.swing.JLabel();
        fondoPanelEstrategia = new javax.swing.JPanel();
        textoEstrategia = new javax.swing.JLabel();
        fondoPanelTodos = new javax.swing.JPanel();
        botonTodos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        fondoBarraSuperior.setBackground(new java.awt.Color(153, 0, 255));

        fondoPanelAccion.setBackground(new java.awt.Color(153, 0, 255));

        textoAccion.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textoAccion.setForeground(new java.awt.Color(255, 255, 255));
        textoAccion.setText("   Accion");
        textoAccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoAccionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoAccionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoAccionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoPanelAccionLayout = new javax.swing.GroupLayout(fondoPanelAccion);
        fondoPanelAccion.setLayout(fondoPanelAccionLayout);
        fondoPanelAccionLayout.setHorizontalGroup(
            fondoPanelAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoAccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        fondoPanelAccionLayout.setVerticalGroup(
            fondoPanelAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoAccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fondoPanelAventura.setBackground(new java.awt.Color(153, 0, 255));

        textoAventura.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textoAventura.setForeground(new java.awt.Color(255, 255, 255));
        textoAventura.setText("Aventura");
        textoAventura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoAventuraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoAventuraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoAventuraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoPanelAventuraLayout = new javax.swing.GroupLayout(fondoPanelAventura);
        fondoPanelAventura.setLayout(fondoPanelAventuraLayout);
        fondoPanelAventuraLayout.setHorizontalGroup(
            fondoPanelAventuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
            .addGroup(fondoPanelAventuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoPanelAventuraLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textoAventura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        fondoPanelAventuraLayout.setVerticalGroup(
            fondoPanelAventuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(fondoPanelAventuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textoAventura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        );

        fondoPanelDeRol.setBackground(new java.awt.Color(153, 0, 255));

        textoDeRol.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textoDeRol.setForeground(new java.awt.Color(255, 255, 255));
        textoDeRol.setText("    De Rol");
        textoDeRol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoDeRolMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoDeRolMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoDeRolMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoPanelDeRolLayout = new javax.swing.GroupLayout(fondoPanelDeRol);
        fondoPanelDeRol.setLayout(fondoPanelDeRolLayout);
        fondoPanelDeRolLayout.setHorizontalGroup(
            fondoPanelDeRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(fondoPanelDeRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoPanelDeRolLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textoDeRol, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        fondoPanelDeRolLayout.setVerticalGroup(
            fondoPanelDeRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(fondoPanelDeRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textoDeRol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        );

        fondoPanelSimulacion.setBackground(new java.awt.Color(153, 0, 255));

        textoSimulacion.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textoSimulacion.setForeground(new java.awt.Color(255, 255, 255));
        textoSimulacion.setText(" Simulacion");
        textoSimulacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoSimulacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoSimulacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoSimulacionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoPanelSimulacionLayout = new javax.swing.GroupLayout(fondoPanelSimulacion);
        fondoPanelSimulacion.setLayout(fondoPanelSimulacionLayout);
        fondoPanelSimulacionLayout.setHorizontalGroup(
            fondoPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
            .addGroup(fondoPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoPanelSimulacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textoSimulacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        fondoPanelSimulacionLayout.setVerticalGroup(
            fondoPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(fondoPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textoSimulacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        );

        fondoPanelDeportes.setBackground(new java.awt.Color(153, 0, 255));

        textoDeportes.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textoDeportes.setForeground(new java.awt.Color(255, 255, 255));
        textoDeportes.setText("  Deportes");
        textoDeportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoDeportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoDeportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoDeportesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoPanelDeportesLayout = new javax.swing.GroupLayout(fondoPanelDeportes);
        fondoPanelDeportes.setLayout(fondoPanelDeportesLayout);
        fondoPanelDeportesLayout.setHorizontalGroup(
            fondoPanelDeportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(fondoPanelDeportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoPanelDeportesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textoDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        fondoPanelDeportesLayout.setVerticalGroup(
            fondoPanelDeportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(fondoPanelDeportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textoDeportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        );

        fondoPanelEstrategia.setBackground(new java.awt.Color(153, 0, 255));

        textoEstrategia.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textoEstrategia.setForeground(new java.awt.Color(255, 255, 255));
        textoEstrategia.setText("  Estrategia");
        textoEstrategia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoEstrategiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoEstrategiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoEstrategiaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoPanelEstrategiaLayout = new javax.swing.GroupLayout(fondoPanelEstrategia);
        fondoPanelEstrategia.setLayout(fondoPanelEstrategiaLayout);
        fondoPanelEstrategiaLayout.setHorizontalGroup(
            fondoPanelEstrategiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPanelEstrategiaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoEstrategia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        fondoPanelEstrategiaLayout.setVerticalGroup(
            fondoPanelEstrategiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPanelEstrategiaLayout.createSequentialGroup()
                .addComponent(textoEstrategia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fondoPanelTodos.setBackground(new java.awt.Color(153, 0, 255));

        javax.swing.GroupLayout fondoPanelTodosLayout = new javax.swing.GroupLayout(fondoPanelTodos);
        fondoPanelTodos.setLayout(fondoPanelTodosLayout);
        fondoPanelTodosLayout.setHorizontalGroup(
            fondoPanelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        fondoPanelTodosLayout.setVerticalGroup(
            fondoPanelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        botonTodos.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        botonTodos.setForeground(new java.awt.Color(255, 255, 255));
        botonTodos.setText("  Todos");
        botonTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTodosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonTodosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonTodosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBarraSuperiorLayout = new javax.swing.GroupLayout(fondoBarraSuperior);
        fondoBarraSuperior.setLayout(fondoBarraSuperiorLayout);
        fondoBarraSuperiorLayout.setHorizontalGroup(
            fondoBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoBarraSuperiorLayout.createSequentialGroup()
                .addComponent(fondoPanelAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondoPanelAventura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondoPanelDeRol, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fondoPanelSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fondoPanelDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondoPanelEstrategia, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(botonTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondoPanelTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoBarraSuperiorLayout.setVerticalGroup(
            fondoBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanelAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondoPanelAventura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondoPanelDeRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondoPanelSimulacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondoPanelDeportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondoPanelEstrategia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondoPanelTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTable1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Categoria", "Valoracion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoBarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(fondoBarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textoEstrategiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoEstrategiaMouseExited
        // TODO add your handling code here:
        fondoPanelEstrategia.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_textoEstrategiaMouseExited

    private void textoEstrategiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoEstrategiaMouseEntered
        // TODO add your handling code here:
        fondoPanelEstrategia.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_textoEstrategiaMouseEntered

    private void textoEstrategiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoEstrategiaMouseClicked
        
        listarPorCategoria(EJuegos.ESTRATEGIA.getCategoria());
    }//GEN-LAST:event_textoEstrategiaMouseClicked

    private void textoDeportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoDeportesMouseExited
        // TODO add your handling code here:
        fondoPanelDeportes.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_textoDeportesMouseExited

    private void textoDeportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoDeportesMouseEntered
        // TODO add your handling code here:
        fondoPanelDeportes.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_textoDeportesMouseEntered

    private void textoDeportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoDeportesMouseClicked
      
        listarPorCategoria(EJuegos.DEPORTES.getCategoria());
    }//GEN-LAST:event_textoDeportesMouseClicked

    private void textoSimulacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoSimulacionMouseExited
        // TODO add your handling code here:
        fondoPanelSimulacion.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_textoSimulacionMouseExited

    private void textoSimulacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoSimulacionMouseEntered
        // TODO add your handling code here:
        fondoPanelSimulacion.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_textoSimulacionMouseEntered

    private void textoSimulacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoSimulacionMouseClicked
      
        listarPorCategoria(EJuegos.SIMULACION.getCategoria());
    }//GEN-LAST:event_textoSimulacionMouseClicked

    private void textoDeRolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoDeRolMouseExited
        // TODO add your handling code here:
        fondoPanelDeRol.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_textoDeRolMouseExited

    private void textoDeRolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoDeRolMouseEntered
        // TODO add your handling code here:
        fondoPanelDeRol.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_textoDeRolMouseEntered

    private void textoDeRolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoDeRolMouseClicked
        
        listarPorCategoria(EJuegos.DEROL.getCategoria());
    }//GEN-LAST:event_textoDeRolMouseClicked

    private void textoAventuraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoAventuraMouseExited
        // TODO add your handling code here:
        fondoPanelAventura.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_textoAventuraMouseExited

    private void textoAventuraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoAventuraMouseEntered
        // TODO add your handling code here:
        fondoPanelAventura.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_textoAventuraMouseEntered

    private void textoAventuraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoAventuraMouseClicked

        listarPorCategoria(EJuegos.AVENTURA.getCategoria());
    }//GEN-LAST:event_textoAventuraMouseClicked

    private void textoAccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoAccionMouseExited
        // TODO add your handling code here:
        fondoPanelAccion.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_textoAccionMouseExited

    private void textoAccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoAccionMouseEntered
        // TODO add your handling code here:
        fondoPanelAccion.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_textoAccionMouseEntered

    private void textoAccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoAccionMouseClicked

        listarPorCategoria(EJuegos.ACCION.getCategoria());
    }//GEN-LAST:event_textoAccionMouseClicked

    private void botonTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTodosMouseClicked
        // TODO add your handling code here:
        DefaultTableModel datos=(DefaultTableModel)jTable1.getModel();
        datos.setNumRows(0);
        for(Juego juego: this.juegos){
                Object [] fila = {juego.getNombre(),juego.getCategoria(),juego.getValoracion()};
                datos.addRow(fila);
        }
    }//GEN-LAST:event_botonTodosMouseClicked

    private void botonTodosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTodosMouseEntered
        // TODO add your handling code here:
        fondoPanelTodos.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_botonTodosMouseEntered

    private void botonTodosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTodosMouseExited
        // TODO add your handling code here:
        fondoPanelTodos.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_botonTodosMouseExited

    //Agrega los juegos a la tabla teniendo en cuenta que sean de la categoria que se envia por parametro
    private void listarPorCategoria(String categoria){
        DefaultTableModel datos=(DefaultTableModel)jTable1.getModel();
        datos.setNumRows(0);
        for(Juego juego: this.juegos){
            if(juego.getCategoria().equals(categoria)){
                Object [] fila = {juego.getNombre(),juego.getCategoria(),juego.getValoracion()};
                datos.addRow(fila);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonTodos;
    private javax.swing.JPanel fondoBarraSuperior;
    private javax.swing.JPanel fondoPanelAccion;
    private javax.swing.JPanel fondoPanelAventura;
    private javax.swing.JPanel fondoPanelDeRol;
    private javax.swing.JPanel fondoPanelDeportes;
    private javax.swing.JPanel fondoPanelEstrategia;
    private javax.swing.JPanel fondoPanelSimulacion;
    private javax.swing.JPanel fondoPanelTodos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel textoAccion;
    private javax.swing.JLabel textoAventura;
    private javax.swing.JLabel textoDeRol;
    private javax.swing.JLabel textoDeportes;
    private javax.swing.JLabel textoEstrategia;
    private javax.swing.JLabel textoSimulacion;
    // End of variables declaration//GEN-END:variables
}
