/*
 * Generated code DO NOT EDIT
 * Generated file: RbrVariableUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RbrVariableUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrVariableUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrVarObjectData RbrVarUpdateIn;
/**
 *
 * Constructor to create a  RbrVariableUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrVariableUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrVarObjectData RbrVarUpdateInIn) {
    super(id, context, "RbrVariableUpdate");
    RbrVarUpdateIn = RbrVarUpdateInIn;
  }

  public void translateToMap() {
    if (RbrVarUpdateIn != null) {
      RbrVarUpdateIn.resetFlags(true, true);
      addInput("RbrVariable", RbrVarObjectHelper.toMap(RbrVarUpdateIn, new HashMap(), "RbrVariable").get("RbrVariable"));
    }
  }


/**
 *
 * Sets the RbrVariable
 * @param RbrVarUpdateInIn Value of the RbrVarUpdateIn
 *
 */

  public void setRbrVariable(RbrVarObjectData RbrVarUpdateInIn) {
    RbrVarUpdateIn = RbrVarUpdateInIn;
  }

  public void translateFromMap() {
    RbrVarUpdateIn = RbrVarObjectHelper.fromMap(inputMap, "RbrVariable");
  }

/**
 *
 * Gets the RbrVariable
 * @return Value of the RbrVariable
 *
 */

  public RbrVarObjectData getRbrVariable( ) {
    return RbrVarUpdateIn;
  }

}
