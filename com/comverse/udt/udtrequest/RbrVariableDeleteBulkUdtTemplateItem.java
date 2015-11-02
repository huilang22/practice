/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrVariableDeleteBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a RbrVariableDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrVariableDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrVarObjectKeyData RbrVarDeleteIn;
/**
 *
 * Constructor to create a  RbrVariableDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrVariableDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrVarObjectKeyData RbrVarDeleteInIn) {
    super(id, context, "RbrVariableDelete");
    RbrVarDeleteIn = RbrVarDeleteInIn;
  }

  public void translateToMap() {
    if (RbrVarDeleteIn != null) {
      RbrVarDeleteIn.resetFlags(true, true);
      addInput("RbrVariable", RbrVarObjectKeyHelper.toMap(RbrVarDeleteIn, new HashMap(), "RbrVarObjectKeyData").get("RbrVarObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrVariable
 * @param RbrVarDeleteInIn Value of the RbrVarDeleteIn
 *
 */

  public void setRbrVariable(RbrVarObjectKeyData RbrVarDeleteInIn) {
    RbrVarDeleteIn = RbrVarDeleteInIn;
  }

  public void translateFromMap() {
    RbrVarDeleteIn = RbrVarObjectKeyHelper.fromMap(inputMap, "RbrVariable");
  }

/**
 *
 * Gets the RbrVariable
 * @return Value of the RbrVariable
 *
 */

  public RbrVarObjectKeyData getRbrVariable( ) {
    return RbrVarDeleteIn;
  }

}
