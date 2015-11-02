/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MIHSubscriberSyncBulkUdtTemplateItem.java
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
 * Class used to create a MIHSubscriberSyncBulkUdtTemplateItem Bulk Template
 *
 */

public class MIHSubscriberSyncBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String ____msisdn;
/**
 *
 * Constructor to create a  MIHSubscriberSyncBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MIHSubscriberSyncBulkUdtTemplateItem(String id, BSDMSessionContext context, String ____msisdnIn) {
    super(id, context, "MIHSubscriberSync");
    ____msisdn = ____msisdnIn;
  }

  public void translateToMap() {
    if (____msisdn != null) {
      addInput("Msisdn", ____msisdn);
    }
  }


/**
 *
 * Sets the Msisdn
 * @param ____msisdnIn Value of the ____msisdn
 *
 */

  public void setMsisdn(String ____msisdnIn) {
    ____msisdn = ____msisdnIn;
  }

  public void translateFromMap() {
    ____msisdn = (String)inputMap.get("Msisdn");
  }

/**
 *
 * Gets the Msisdn
 * @return Value of the Msisdn
 *
 */

  public String getMsisdn( ) {
    return ____msisdn;
  }

}
