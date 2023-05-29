package beatalbumshop;

import beatalbumshop.componment.MyLabel;
import beatalbumshop.dao.AlbumDAO;
import beatalbumshop.dao.AlbumDAOImpl;
import beatalbumshop.model.AlbumSpotify;
import beatalbumshop.utils.ImageResizing;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.net.URL;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AlbumDetail extends javax.swing.JPanel {

    AlbumDAO albumDAO = new AlbumDAOImpl();
    
    public AlbumDetail(int id) {
        initComponents();
        
        AlbumSpotify albumSpotify = albumDAO.getDetailByID(id + "");
        
//        lblImage.setIcon(ImageResizing.ImageResizing("src/beatalbumshop/resources/images/albums/" + albumSpotify.getAlbumID() + ".png", 300, 300));
        try {
            URL url = new URL("https://firebasestorage.googleapis.com/v0/b/beat-75a88.appspot.com/o/albums%2F" + albumSpotify.getAlbumID() + ".png?alt=media");
            Image image = ImageIO.read(url);
            lblImage.setIcon(ImageResizing.ImageResizing(image, 300, 300));
        } catch(Exception ex) {
            lblImage.setIcon(null);
            ex.printStackTrace();
        }

        lblName.setText(albumSpotify.getAlbumName());
        lblArtist.setText(albumSpotify.getArtist());
        lblReleaseDate.setText(albumSpotify.getReleaseDate());
        lblPrice.setText("$" + albumSpotify.getAlbumPrice() + "");
        
        pnlTrackList.setLayout(new GridLayout(0, 1, 0, 0));
        pnlTrackList.setBorder(new EmptyBorder(0, 20, 0, 20));

        HashMap<String, String> mTracks = albumSpotify.getmTracks();
        for (String i : mTracks.keySet()) {
            JPanel pnl = new JPanel(new BorderLayout());
            pnl.setPreferredSize(new Dimension(365, 40));
            pnl.setBackground(null);
            pnl.add(new MyLabel(i), BorderLayout.WEST);
            pnl.add(new MyLabel(mTracks.get(i)), BorderLayout.EAST);
            pnlTrackList.add(pnl);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlContent = new javax.swing.JPanel();
        lblImage = new beatalbumshop.componment.MyLabel();
        lblName = new beatalbumshop.componment.MyLabel();
        lblArtist = new beatalbumshop.componment.MyLabel();
        lblReleaseDate = new beatalbumshop.componment.MyLabel();
        lblPrice = new beatalbumshop.componment.MyLabel();
        myScrollPane1 = new beatalbumshop.componment.MyScrollPane();
        pnlTrackList = new javax.swing.JPanel();
        myButton1 = new beatalbumshop.componment.MyButton();
        btnClose = new beatalbumshop.componment.MyButton();

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));

        lblName.setText("30");
        lblName.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N

        lblArtist.setForeground(new java.awt.Color(80, 80, 80));
        lblArtist.setText("Adele");

        lblReleaseDate.setForeground(new java.awt.Color(80, 80, 80));
        lblReleaseDate.setText("2021-10-15");

        lblPrice.setForeground(new java.awt.Color(80, 80, 80));
        lblPrice.setText("$ 33");

        myScrollPane1.setBorder(null);
        myScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlTrackList.setBackground(new java.awt.Color(255, 255, 255));
        pnlTrackList.setMaximumSize(new java.awt.Dimension(408, 414));
        pnlTrackList.setMinimumSize(new java.awt.Dimension(408, 414));

        javax.swing.GroupLayout pnlTrackListLayout = new javax.swing.GroupLayout(pnlTrackList);
        pnlTrackList.setLayout(pnlTrackListLayout);
        pnlTrackListLayout.setHorizontalGroup(
            pnlTrackListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );
        pnlTrackListLayout.setVerticalGroup(
            pnlTrackListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        myScrollPane1.setViewportView(pnlTrackList);

        myButton1.setBackground(new java.awt.Color(0, 162, 47));
        myButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 162, 47)));
        myButton1.setForeground(new java.awt.Color(255, 255, 255));
        myButton1.setText("Buy Now");

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReleaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(myScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblReleaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        btnClose.setBackground(null);
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beatalbumshop/resources/images/icons/back.png"))); // NOI18N
        btnClose.setPreferredSize(new java.awt.Dimension(70, 50));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        JPanel pnlTabContent = (JPanel) getParent();
        CardLayout c = (CardLayout) pnlTabContent.getLayout();
        c.show(pnlTabContent, "shop");
    }//GEN-LAST:event_btnCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private beatalbumshop.componment.MyButton btnClose;
    private beatalbumshop.componment.MyLabel lblArtist;
    private beatalbumshop.componment.MyLabel lblImage;
    private beatalbumshop.componment.MyLabel lblName;
    private beatalbumshop.componment.MyLabel lblPrice;
    private beatalbumshop.componment.MyLabel lblReleaseDate;
    private beatalbumshop.componment.MyButton myButton1;
    private beatalbumshop.componment.MyScrollPane myScrollPane1;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTrackList;
    // End of variables declaration//GEN-END:variables
}
