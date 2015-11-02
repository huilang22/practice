/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionGrpFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ConditionGrpFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionGrpFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondGrpObjFilter findIn;
/**
 *
 * Constructor to create a  ConditionGrpFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionGrpFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CondGrpObjFilter findInIn) {
    super(id, context, "ConditionGrpFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ConditionGrp", CondGrpObjHelper.toMap(findIn, new HashMap(), "ConditionGrp").get("ConditionGrp"));
    }
  }


/**
 *
 * Sets the ConditionGrp
 * @param findInIn Value of the findIn
 *
 */

  public void setConditionGrp(CondGrpObjFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = CondGrpObjHelper.fromMapFilter(inputMap, "ConditionGrp");
  }

/**
 *
 * Gets the ConditionGrp
 * @return Value of the ConditionGrp
 *
 */

  public CondGrpObjFilter getConditionGrp( ) {
    return findIn;
  }

}
