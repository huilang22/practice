/*
 * Generated code DO NOT EDIT
 * Generated file: OppvDeliveryGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OppvDeliveryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class OppvDeliveryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OppvDeliveryObjKeyData getIn;
/**
 *
 * Constructor to create a  OppvDeliveryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OppvDeliveryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, OppvDeliveryObjKeyData getInIn) {
    super(id, context, "OppvDeliveryGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("OppvDelivery", OppvDeliveryObjKeyHelper.toMap(getIn, new HashMap(), "OppvDeliveryObjKeyData").get("OppvDeliveryObjKeyData"));
    }
  }


/**
 *
 * Sets the OppvDelivery
 * @param getInIn Value of the getIn
 *
 */

  public void setOppvDelivery(OppvDeliveryObjKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = OppvDeliveryObjKeyHelper.fromMap(inputMap, "OppvDelivery");
  }

/**
 *
 * Gets the OppvDelivery
 * @return Value of the OppvDelivery
 *
 */

  public OppvDeliveryObjKeyData getOppvDelivery( ) {
    return getIn;
  }

}
