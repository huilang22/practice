/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SpecialDestinationTypeGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a SpecialDestinationTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class SpecialDestinationTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SpecialDestinationTypeObjectKeyData sdGetIn;
/**
 *
 * Constructor to create a  SpecialDestinationTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SpecialDestinationTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, SpecialDestinationTypeObjectKeyData sdGetInIn) {
    super(id, context, "SpecialDestinationTypeGet");
    sdGetIn = sdGetInIn;
  }

  public void translateToMap() {
    if (sdGetIn != null) {
      sdGetIn.resetFlags(true, true);
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectKeyHelper.toMap(sdGetIn, new HashMap(), "SpecialDestinationTypeObjectKeyData").get("SpecialDestinationTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the SpecialDestinationType
 * @param sdGetInIn Value of the sdGetIn
 *
 */

  public void setSpecialDestinationType(SpecialDestinationTypeObjectKeyData sdGetInIn) {
    sdGetIn = sdGetInIn;
  }

  public void translateFromMap() {
    sdGetIn = SpecialDestinationTypeObjectKeyHelper.fromMap(inputMap, "SpecialDestinationType");
  }

/**
 *
 * Gets the SpecialDestinationType
 * @return Value of the SpecialDestinationType
 *
 */

  public SpecialDestinationTypeObjectKeyData getSpecialDestinationType( ) {
    return sdGetIn;
  }

}
