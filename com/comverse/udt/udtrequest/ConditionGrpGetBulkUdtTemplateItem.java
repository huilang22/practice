/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionGrpGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ConditionGrpGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionGrpGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondGrpObjBaseKeyData getIn;
/**
 *
 * Constructor to create a  ConditionGrpGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionGrpGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CondGrpObjBaseKeyData getInIn) {
    super(id, context, "ConditionGrpGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("ConditionGrp", CondGrpObjBaseKeyHelper.toMap(getIn, new HashMap(), "CondGrpObjBaseKeyData").get("CondGrpObjBaseKeyData"));
    }
  }


/**
 *
 * Sets the ConditionGrp
 * @param getInIn Value of the getIn
 *
 */

  public void setConditionGrp(CondGrpObjBaseKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = CondGrpObjBaseKeyHelper.fromMap(inputMap, "ConditionGrp");
  }

/**
 *
 * Gets the ConditionGrp
 * @return Value of the ConditionGrp
 *
 */

  public CondGrpObjBaseKeyData getConditionGrp( ) {
    return getIn;
  }

}
