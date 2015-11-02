/*
 * Generated code DO NOT EDIT
 * Generated file: RbrVariableGetBulkUdtTemplateItem.java
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
 * Class used to create a RbrVariableGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrVariableGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrVarObjectKeyData RbrVarGetIn;
/**
 *
 * Constructor to create a  RbrVariableGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrVariableGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrVarObjectKeyData RbrVarGetInIn) {
    super(id, context, "RbrVariableGet");
    RbrVarGetIn = RbrVarGetInIn;
  }

  public void translateToMap() {
    if (RbrVarGetIn != null) {
      RbrVarGetIn.resetFlags(true, true);
      addInput("RbrVariable", RbrVarObjectKeyHelper.toMap(RbrVarGetIn, new HashMap(), "RbrVarObjectKeyData").get("RbrVarObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrVariable
 * @param RbrVarGetInIn Value of the RbrVarGetIn
 *
 */

  public void setRbrVariable(RbrVarObjectKeyData RbrVarGetInIn) {
    RbrVarGetIn = RbrVarGetInIn;
  }

  public void translateFromMap() {
    RbrVarGetIn = RbrVarObjectKeyHelper.fromMap(inputMap, "RbrVariable");
  }

/**
 *
 * Gets the RbrVariable
 * @return Value of the RbrVariable
 *
 */

  public RbrVarObjectKeyData getRbrVariable( ) {
    return RbrVarGetIn;
  }

}
