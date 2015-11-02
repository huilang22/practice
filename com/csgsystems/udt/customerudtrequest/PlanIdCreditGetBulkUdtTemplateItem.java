/*
 * Generated code DO NOT EDIT
 * Generated file: PlanIdCreditGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a PlanIdCreditGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PlanIdCreditGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PlanIdCreditObjectKeyData picGetIn;
/**
 *
 * Constructor to create a  PlanIdCreditGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PlanIdCreditGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PlanIdCreditObjectKeyData picGetInIn) {
    super(id, context, "PlanIdCreditGet");
    picGetIn = picGetInIn;
  }

  public void translateToMap() {
    if (picGetIn != null) {
      picGetIn.resetFlags(true, true);
      addInput("PlanIdCredit", PlanIdCreditObjectKeyHelper.toMap(picGetIn, new HashMap(), "PlanIdCreditObjectKeyData").get("PlanIdCreditObjectKeyData"));
    }
  }


/**
 *
 * Sets the PlanIdCredit
 * @param picGetInIn Value of the picGetIn
 *
 */

  public void setPlanIdCredit(PlanIdCreditObjectKeyData picGetInIn) {
    picGetIn = picGetInIn;
  }

  public void translateFromMap() {
    picGetIn = PlanIdCreditObjectKeyHelper.fromMap(inputMap, "PlanIdCredit");
  }

/**
 *
 * Gets the PlanIdCredit
 * @return Value of the PlanIdCredit
 *
 */

  public PlanIdCreditObjectKeyData getPlanIdCredit( ) {
    return picGetIn;
  }

}
