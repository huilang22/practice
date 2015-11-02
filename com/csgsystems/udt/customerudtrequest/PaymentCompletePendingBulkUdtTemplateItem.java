/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentCompletePendingBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a PaymentCompletePendingBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentCompletePendingBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer paypndcmp_tracking_id;
  protected Integer paypndcmp_tracking_id_serv;
/**
 *
 * Constructor to create a  PaymentCompletePendingBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentCompletePendingBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer paypndcmp_tracking_idIn, Integer paypndcmp_tracking_id_servIn) {
    super(id, context, "PaymentCompletePending");
    paypndcmp_tracking_id = paypndcmp_tracking_idIn;
    paypndcmp_tracking_id_serv = paypndcmp_tracking_id_servIn;
  }

  public void translateToMap() {
    if (paypndcmp_tracking_id != null) {
      addInput("PaypndcmpTrackingId", paypndcmp_tracking_id);
    }
    if (paypndcmp_tracking_id_serv != null) {
      addInput("PaypndcmpTrackingIdServ", paypndcmp_tracking_id_serv);
    }
  }


/**
 *
 * Sets the PaypndcmpTrackingId
 * @param paypndcmp_tracking_idIn Value of the paypndcmp_tracking_id
 *
 */

  public void setPaypndcmpTrackingId(Integer paypndcmp_tracking_idIn) {
    paypndcmp_tracking_id = paypndcmp_tracking_idIn;
  }

/**
 *
 * Sets the PaypndcmpTrackingIdServ
 * @param paypndcmp_tracking_id_servIn Value of the paypndcmp_tracking_id_serv
 *
 */

  public void setPaypndcmpTrackingIdServ(Integer paypndcmp_tracking_id_servIn) {
    paypndcmp_tracking_id_serv = paypndcmp_tracking_id_servIn;
  }

  public void translateFromMap() {
    paypndcmp_tracking_id = (Integer)inputMap.get("PaypndcmpTrackingId");
    paypndcmp_tracking_id_serv = (Integer)inputMap.get("PaypndcmpTrackingIdServ");
  }

/**
 *
 * Gets the PaypndcmpTrackingId
 * @return Value of the PaypndcmpTrackingId
 *
 */

  public Integer getPaypndcmpTrackingId( ) {
    return paypndcmp_tracking_id;
  }

/**
 *
 * Gets the PaypndcmpTrackingIdServ
 * @return Value of the PaypndcmpTrackingIdServ
 *
 */

  public Integer getPaypndcmpTrackingIdServ( ) {
    return paypndcmp_tracking_id_serv;
  }

}
