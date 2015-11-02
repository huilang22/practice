/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentProfileDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AxrtPaymentProfileDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AxrtPaymentProfileDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AxrtPaymentProfileObjectData axrtppdIn;
/**
 *
 * Constructor to create a  AxrtPaymentProfileDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AxrtPaymentProfileDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtPaymentProfileObjectData axrtppdInIn) {
    super(id, context, "AxrtPaymentProfileDelete");
    axrtppdIn = axrtppdInIn;
  }

  public void translateToMap() {
    if (axrtppdIn != null) {
      axrtppdIn.resetFlags(true, true);
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(axrtppdIn, new HashMap(), "AxrtPaymentProfile").get("AxrtPaymentProfile"));
    }
  }


/**
 *
 * Sets the AxrtPaymentProfile
 * @param axrtppdInIn Value of the axrtppdIn
 *
 */

  public void setAxrtPaymentProfile(AxrtPaymentProfileObjectData axrtppdInIn) {
    axrtppdIn = axrtppdInIn;
  }

  public void translateFromMap() {
    axrtppdIn = AxrtPaymentProfileObjectHelper.fromMap(inputMap, "AxrtPaymentProfile");
  }

/**
 *
 * Gets the AxrtPaymentProfile
 * @return Value of the AxrtPaymentProfile
 *
 */

  public AxrtPaymentProfileObjectData getAxrtPaymentProfile( ) {
    return axrtppdIn;
  }

}
