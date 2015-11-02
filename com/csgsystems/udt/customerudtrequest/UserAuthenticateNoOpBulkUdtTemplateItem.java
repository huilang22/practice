/*
 * Generated code DO NOT EDIT
 * Generated file: UserAuthenticateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UserAuthenticateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UserAuthenticateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UserAuthenticateOutputData noOpIn;

/**
 *
 * Constructor to create a   UserAuthenticateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UserAuthenticateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UserAuthenticateOutputData noOpInIn) {
    super(id, context, "UserAuthenticate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UserAuthenticateOutputData", UserAuthenticateOutputHelper.toMap(noOpIn).get("UserAuthenticateOutputData"));
    }
  }
/**
 *
 * Sets the  UserAuthenticateOutputData
 * @param noOpInIn UserAuthenticateOutputData to set
 *
 */
  public void setUserAuthenticateOutputData(UserAuthenticateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UserAuthenticateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public UserAuthenticateOutputData getUserAuthenticateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UserAuthenticateOutputHelper.fromMap(inputMap);
  }
}
