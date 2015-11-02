/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentCancelPendingBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a PaymentCancelPendingBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentCancelPendingBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer paypndcnl_tracking_id;
  protected Integer paypndcnl_tracking_id_serv;
/**
 *
 * Constructor to create a  PaymentCancelPendingBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentCancelPendingBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer paypndcnl_tracking_idIn, Integer paypndcnl_tracking_id_servIn) {
    super(id, context, "PaymentCancelPending");
    paypndcnl_tracking_id = paypndcnl_tracking_idIn;
    paypndcnl_tracking_id_serv = paypndcnl_tracking_id_servIn;
  }

  public void translateToMap() {
    if (paypndcnl_tracking_id != null) {
      addInput("PaypndcnlTrackingId", paypndcnl_tracking_id);
    }
    if (paypndcnl_tracking_id_serv != null) {
      addInput("PaypndcnlTrackingIdServ", paypndcnl_tracking_id_serv);
    }
  }


/**
 *
 * Sets the PaypndcnlTrackingId
 * @param paypndcnl_tracking_idIn Value of the paypndcnl_tracking_id
 *
 */

  public void setPaypndcnlTrackingId(Integer paypndcnl_tracking_idIn) {
    paypndcnl_tracking_id = paypndcnl_tracking_idIn;
  }

/**
 *
 * Sets the PaypndcnlTrackingIdServ
 * @param paypndcnl_tracking_id_servIn Value of the paypndcnl_tracking_id_serv
 *
 */

  public void setPaypndcnlTrackingIdServ(Integer paypndcnl_tracking_id_servIn) {
    paypndcnl_tracking_id_serv = paypndcnl_tracking_id_servIn;
  }

  public void translateFromMap() {
    paypndcnl_tracking_id = (Integer)inputMap.get("PaypndcnlTrackingId");
    paypndcnl_tracking_id_serv = (Integer)inputMap.get("PaypndcnlTrackingIdServ");
  }

/**
 *
 * Gets the PaypndcnlTrackingId
 * @return Value of the PaypndcnlTrackingId
 *
 */

  public Integer getPaypndcnlTrackingId( ) {
    return paypndcnl_tracking_id;
  }

/**
 *
 * Gets the PaypndcnlTrackingIdServ
 * @return Value of the PaypndcnlTrackingIdServ
 *
 */

  public Integer getPaypndcnlTrackingIdServ( ) {
    return paypndcnl_tracking_id_serv;
  }

}
