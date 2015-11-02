/*
 * Generated code DO NOT EDIT
 * Generated file: PlanIdCreditUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PlanIdCreditUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PlanIdCreditUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PlanIdCreditObjectData picUpdIn;
/**
 *
 * Constructor to create a  PlanIdCreditUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PlanIdCreditUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PlanIdCreditObjectData picUpdInIn) {
    super(id, context, "PlanIdCreditUpdate");
    picUpdIn = picUpdInIn;
  }

  public void translateToMap() {
    if (picUpdIn != null) {
      picUpdIn.resetFlags(true, true);
      addInput("PlanIdCredit", PlanIdCreditObjectHelper.toMap(picUpdIn, new HashMap(), "PlanIdCredit").get("PlanIdCredit"));
    }
  }


/**
 *
 * Sets the PlanIdCredit
 * @param picUpdInIn Value of the picUpdIn
 *
 */

  public void setPlanIdCredit(PlanIdCreditObjectData picUpdInIn) {
    picUpdIn = picUpdInIn;
  }

  public void translateFromMap() {
    picUpdIn = PlanIdCreditObjectHelper.fromMap(inputMap, "PlanIdCredit");
  }

/**
 *
 * Gets the PlanIdCredit
 * @return Value of the PlanIdCredit
 *
 */

  public PlanIdCreditObjectData getPlanIdCredit( ) {
    return picUpdIn;
  }

}
