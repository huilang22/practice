/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a OppvDeliveryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class OppvDeliveryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OppvDeliveryObjData updateIn;
/**
 *
 * Constructor to create a  OppvDeliveryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OppvDeliveryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, OppvDeliveryObjData updateInIn) {
    super(id, context, "OppvDeliveryUpdate");
    updateIn = updateInIn;
  }

  public void translateToMap() {
    if (updateIn != null) {
      updateIn.resetFlags(true, true);
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(updateIn, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }


/**
 *
 * Sets the OppvDelivery
 * @param updateInIn Value of the updateIn
 *
 */

  public void setOppvDelivery(OppvDeliveryObjData updateInIn) {
    updateIn = updateInIn;
  }

  public void translateFromMap() {
    updateIn = OppvDeliveryObjHelper.fromMap(inputMap, "OppvDelivery");
  }

/**
 *
 * Gets the OppvDelivery
 * @return Value of the OppvDelivery
 *
 */

  public OppvDeliveryObjData getOppvDelivery( ) {
    return updateIn;
  }

}
