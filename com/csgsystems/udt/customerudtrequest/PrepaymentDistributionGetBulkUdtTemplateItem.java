/*
 * Generated code DO NOT EDIT
 * Generated file: PrepaymentDistributionGetBulkUdtTemplateItem.java
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
 * Class used to create a PrepaymentDistributionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PrepaymentDistributionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PrepaymentDistributionObjectKeyData PDGetIn;
/**
 *
 * Constructor to create a  PrepaymentDistributionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PrepaymentDistributionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PrepaymentDistributionObjectKeyData PDGetInIn) {
    super(id, context, "PrepaymentDistributionGet");
    PDGetIn = PDGetInIn;
  }

  public void translateToMap() {
    if (PDGetIn != null) {
      PDGetIn.resetFlags(true, true);
      addInput("PrepaymentDistribution", PrepaymentDistributionObjectKeyHelper.toMap(PDGetIn, new HashMap(), "PrepaymentDistributionObjectKeyData").get("PrepaymentDistributionObjectKeyData"));
    }
  }


/**
 *
 * Sets the PrepaymentDistribution
 * @param PDGetInIn Value of the PDGetIn
 *
 */

  public void setPrepaymentDistribution(PrepaymentDistributionObjectKeyData PDGetInIn) {
    PDGetIn = PDGetInIn;
  }

  public void translateFromMap() {
    PDGetIn = PrepaymentDistributionObjectKeyHelper.fromMap(inputMap, "PrepaymentDistribution");
  }

/**
 *
 * Gets the PrepaymentDistribution
 * @return Value of the PrepaymentDistribution
 *
 */

  public PrepaymentDistributionObjectKeyData getPrepaymentDistribution( ) {
    return PDGetIn;
  }

}
