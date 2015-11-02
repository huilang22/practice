/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryCreateBulkUdtTemplateItem.java
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
 * Class used to create a OppvDeliveryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OppvDeliveryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OppvDeliveryObjData createIn;
/**
 *
 * Constructor to create a  OppvDeliveryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OppvDeliveryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, OppvDeliveryObjData createInIn) {
    super(id, context, "OppvDeliveryCreate");
    createIn = createInIn;
  }

  public void translateToMap() {
    if (createIn != null) {
      createIn.resetFlags(true, true);
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(createIn, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }


/**
 *
 * Sets the OppvDelivery
 * @param createInIn Value of the createIn
 *
 */

  public void setOppvDelivery(OppvDeliveryObjData createInIn) {
    createIn = createInIn;
  }

  public void translateFromMap() {
    createIn = OppvDeliveryObjHelper.fromMap(inputMap, "OppvDelivery");
  }

/**
 *
 * Gets the OppvDelivery
 * @return Value of the OppvDelivery
 *
 */

  public OppvDeliveryObjData getOppvDelivery( ) {
    return createIn;
  }

}
