/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryNonCancelledFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OppvDeliveryNonCancelledFindBulkUdtTemplateItem Bulk Template
 *
 */

public class OppvDeliveryNonCancelledFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OppvOrderItemObjFilter ncfindIn;
/**
 *
 * Constructor to create a  OppvDeliveryNonCancelledFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OppvDeliveryNonCancelledFindBulkUdtTemplateItem(String id, BSDMSessionContext context, OppvOrderItemObjFilter ncfindInIn) {
    super(id, context, "OppvDeliveryNonCancelledFind");
    ncfindIn = ncfindInIn;
  }

  public void translateToMap() {
    if (ncfindIn != null) {
      Integer index =  ncfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OppvDelivery", OppvOrderItemObjHelper.toMap(ncfindIn, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }


/**
 *
 * Sets the OppvDelivery
 * @param ncfindInIn Value of the ncfindIn
 *
 */

  public void setOppvDelivery(OppvOrderItemObjFilter ncfindInIn) {
    ncfindIn = ncfindInIn;
  }

  public void translateFromMap() {
    ncfindIn = OppvOrderItemObjHelper.fromMapFilter(inputMap, "OppvDelivery");
  }

/**
 *
 * Gets the OppvDelivery
 * @return Value of the OppvDelivery
 *
 */

  public OppvOrderItemObjFilter getOppvDelivery( ) {
    return ncfindIn;
  }

}
