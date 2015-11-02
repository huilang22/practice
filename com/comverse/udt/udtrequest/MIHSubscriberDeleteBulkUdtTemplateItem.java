/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MIHSubscriberDeleteBulkUdtTemplateItem.java
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
 * Class used to create a MIHSubscriberDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class MIHSubscriberDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String __msisdn;
/**
 *
 * Constructor to create a  MIHSubscriberDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MIHSubscriberDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, String __msisdnIn) {
    super(id, context, "MIHSubscriberDelete");
    __msisdn = __msisdnIn;
  }

  public void translateToMap() {
    if (__msisdn != null) {
      addInput("Msisdn", __msisdn);
    }
  }


/**
 *
 * Sets the Msisdn
 * @param __msisdnIn Value of the __msisdn
 *
 */

  public void setMsisdn(String __msisdnIn) {
    __msisdn = __msisdnIn;
  }

  public void translateFromMap() {
    __msisdn = (String)inputMap.get("Msisdn");
  }

/**
 *
 * Gets the Msisdn
 * @return Value of the Msisdn
 *
 */

  public String getMsisdn( ) {
    return __msisdn;
  }

}
