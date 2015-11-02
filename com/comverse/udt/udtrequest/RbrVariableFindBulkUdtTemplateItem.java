/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrVariableFindBulkUdtTemplateItem.java
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
 * Class used to create a RbrVariableFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrVariableFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrVarObjectFilter RbrVarFindIn;
/**
 *
 * Constructor to create a  RbrVariableFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrVariableFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrVarObjectFilter RbrVarFindInIn) {
    super(id, context, "RbrVariableFind");
    RbrVarFindIn = RbrVarFindInIn;
  }

  public void translateToMap() {
    if (RbrVarFindIn != null) {
      Integer index =  RbrVarFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrVariable", RbrVarObjectHelper.toMap(RbrVarFindIn, new HashMap(), "RbrVariable").get("RbrVariable"));
    }
  }


/**
 *
 * Sets the RbrVariable
 * @param RbrVarFindInIn Value of the RbrVarFindIn
 *
 */

  public void setRbrVariable(RbrVarObjectFilter RbrVarFindInIn) {
    RbrVarFindIn = RbrVarFindInIn;
  }

  public void translateFromMap() {
    RbrVarFindIn = RbrVarObjectHelper.fromMapFilter(inputMap, "RbrVariable");
  }

/**
 *
 * Gets the RbrVariable
 * @return Value of the RbrVariable
 *
 */

  public RbrVarObjectFilter getRbrVariable( ) {
    return RbrVarFindIn;
  }

}
