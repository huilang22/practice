/*
 * Generated code DO NOT EDIT
 * Generated file: RbrVariableCreateBulkUdtTemplateItem.java
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
 * Class used to create a RbrVariableCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrVariableCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrVarObjectData RbrVarCreateIn;
/**
 *
 * Constructor to create a  RbrVariableCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrVariableCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrVarObjectData RbrVarCreateInIn) {
    super(id, context, "RbrVariableCreate");
    RbrVarCreateIn = RbrVarCreateInIn;
  }

  public void translateToMap() {
    if (RbrVarCreateIn != null) {
      RbrVarCreateIn.resetFlags(true, true);
      addInput("RbrVariable", RbrVarObjectHelper.toMap(RbrVarCreateIn, new HashMap(), "RbrVariable").get("RbrVariable"));
    }
  }


/**
 *
 * Sets the RbrVariable
 * @param RbrVarCreateInIn Value of the RbrVarCreateIn
 *
 */

  public void setRbrVariable(RbrVarObjectData RbrVarCreateInIn) {
    RbrVarCreateIn = RbrVarCreateInIn;
  }

  public void translateFromMap() {
    RbrVarCreateIn = RbrVarObjectHelper.fromMap(inputMap, "RbrVariable");
  }

/**
 *
 * Gets the RbrVariable
 * @return Value of the RbrVariable
 *
 */

  public RbrVarObjectData getRbrVariable( ) {
    return RbrVarCreateIn;
  }

}
