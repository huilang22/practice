/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillingFrequencyFindBulkUdtTemplateItem.java
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
 * Class used to create a BillingFrequencyFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillingFrequencyFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BFObjectFilter BFFindIn;
/**
 *
 * Constructor to create a  BillingFrequencyFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillingFrequencyFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BFObjectFilter BFFindInIn) {
    super(id, context, "BillingFrequencyFind");
    BFFindIn = BFFindInIn;
  }

  public void translateToMap() {
    if (BFFindIn != null) {
      Integer index =  BFFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillingFrequency", BFObjectHelper.toMap(BFFindIn, new HashMap(), "BillingFrequency").get("BillingFrequency"));
    }
  }


/**
 *
 * Sets the BillingFrequency
 * @param BFFindInIn Value of the BFFindIn
 *
 */

  public void setBillingFrequency(BFObjectFilter BFFindInIn) {
    BFFindIn = BFFindInIn;
  }

  public void translateFromMap() {
    BFFindIn = BFObjectHelper.fromMapFilter(inputMap, "BillingFrequency");
  }

/**
 *
 * Gets the BillingFrequency
 * @return Value of the BillingFrequency
 *
 */

  public BFObjectFilter getBillingFrequency( ) {
    return BFFindIn;
  }

}
