/*
 * Generated code DO NOT EDIT
 * Generated file: ChangePasswordNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.sec.data.*;

/**
 *
 * NoOp class used to simulate a ChangePasswordNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ChangePasswordNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Boolean noOpIn;

/**
 *
 * Constructor to create a   ChangePasswordNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ChangePasswordNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Boolean noOpInIn) {
    super(id, context, "ChangePassword");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("PasswordChanged", noOpIn);
    }
  }
/**
 *
 * Sets the  PasswordChanged
 * @param noOpInIn Boolean to set
 *
 */
  public void setPasswordChanged(Boolean noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PasswordChanged passed into the constructor
 * @return Simulated response
 *
 */
  public Boolean getPasswordChanged() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Boolean)inputMap.get("PasswordChanged");
  }
}
