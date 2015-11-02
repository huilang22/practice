/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryFindBulkUdtTemplateItem.java
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
 * Class used to create a OppvDeliveryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class OppvDeliveryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OppvDeliveryExtObjFilter findIn;
/**
 *
 * Constructor to create a  OppvDeliveryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OppvDeliveryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, OppvDeliveryExtObjFilter findInIn) {
    super(id, context, "OppvDeliveryFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OppvDelivery", OppvDeliveryExtObjHelper.toMap(findIn, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }


/**
 *
 * Sets the OppvDelivery
 * @param findInIn Value of the findIn
 *
 */

  public void setOppvDelivery(OppvDeliveryExtObjFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = OppvDeliveryExtObjHelper.fromMapFilter(inputMap, "OppvDelivery");
  }

/**
 *
 * Gets the OppvDelivery
 * @return Value of the OppvDelivery
 *
 */

  public OppvDeliveryExtObjFilter getOppvDelivery( ) {
    return findIn;
  }

}
