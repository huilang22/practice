/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentProfileFindBulkUdtTemplateItem.java
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
 * Class used to create a AxrtPaymentProfileFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AxrtPaymentProfileFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AxrtPaymentProfileObjectFilter axrtppfIn;
/**
 *
 * Constructor to create a  AxrtPaymentProfileFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AxrtPaymentProfileFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtPaymentProfileObjectFilter axrtppfInIn) {
    super(id, context, "AxrtPaymentProfileFind");
    axrtppfIn = axrtppfInIn;
  }

  public void translateToMap() {
    if (axrtppfIn != null) {
      Integer index =  axrtppfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(axrtppfIn, new HashMap(), "AxrtPaymentProfile").get("AxrtPaymentProfile"));
    }
  }


/**
 *
 * Sets the AxrtPaymentProfile
 * @param axrtppfInIn Value of the axrtppfIn
 *
 */

  public void setAxrtPaymentProfile(AxrtPaymentProfileObjectFilter axrtppfInIn) {
    axrtppfIn = axrtppfInIn;
  }

  public void translateFromMap() {
    axrtppfIn = AxrtPaymentProfileObjectHelper.fromMapFilter(inputMap, "AxrtPaymentProfile");
  }

/**
 *
 * Gets the AxrtPaymentProfile
 * @return Value of the AxrtPaymentProfile
 *
 */

  public AxrtPaymentProfileObjectFilter getAxrtPaymentProfile( ) {
    return axrtppfIn;
  }

}
