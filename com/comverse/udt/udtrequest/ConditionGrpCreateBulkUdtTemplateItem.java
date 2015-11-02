/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionGrpCreateBulkUdtTemplateItem.java
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
 * Class used to create a ConditionGrpCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionGrpCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondGrpObjBaseData createIn;
/**
 *
 * Constructor to create a  ConditionGrpCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionGrpCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CondGrpObjBaseData createInIn) {
    super(id, context, "ConditionGrpCreate");
    createIn = createInIn;
  }

  public void translateToMap() {
    if (createIn != null) {
      createIn.resetFlags(true, true);
      addInput("ConditionGrp", CondGrpObjBaseHelper.toMap(createIn, new HashMap(), "ConditionGrp").get("ConditionGrp"));
    }
  }


/**
 *
 * Sets the ConditionGrp
 * @param createInIn Value of the createIn
 *
 */

  public void setConditionGrp(CondGrpObjBaseData createInIn) {
    createIn = createInIn;
  }

  public void translateFromMap() {
    createIn = CondGrpObjBaseHelper.fromMap(inputMap, "ConditionGrp");
  }

/**
 *
 * Gets the ConditionGrp
 * @return Value of the ConditionGrp
 *
 */

  public CondGrpObjBaseData getConditionGrp( ) {
    return createIn;
  }

}
