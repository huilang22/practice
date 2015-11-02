/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementAutoAssignBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvElementAutoAssignBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementAutoAssignBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjFilter InvAutoAsgnIn;
  protected Integer AssgnQuantity;
  protected Integer AssgnContFlag;
/**
 *
 * Constructor to create a  InvElementAutoAssignBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementAutoAssignBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjFilter InvAutoAsgnInIn, Integer AssgnQuantityIn, Integer AssgnContFlagIn) {
    super(id, context, "InvElementAutoAssign");
    InvAutoAsgnIn = InvAutoAsgnInIn;
    AssgnQuantity = AssgnQuantityIn;
    AssgnContFlag = AssgnContFlagIn;
  }

  public void translateToMap() {
    if (InvAutoAsgnIn != null) {
      Integer index =  InvAutoAsgnIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvAutoAsgnIn, new HashMap(), "InvElement").get("InvElement"));
    }
    if (AssgnQuantity != null) {
      addInput("AssgnQuantity", AssgnQuantity);
    }
    if (AssgnContFlag != null) {
      addInput("AssgnContFlag", AssgnContFlag);
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvAutoAsgnInIn Value of the InvAutoAsgnIn
 *
 */

  public void setInvElement(InvElementObjFilter InvAutoAsgnInIn) {
    InvAutoAsgnIn = InvAutoAsgnInIn;
  }

/**
 *
 * Sets the AssgnQuantity
 * @param AssgnQuantityIn Value of the AssgnQuantity
 *
 */

  public void setAssgnQuantity(Integer AssgnQuantityIn) {
    AssgnQuantity = AssgnQuantityIn;
  }

/**
 *
 * Sets the AssgnContFlag
 * @param AssgnContFlagIn Value of the AssgnContFlag
 *
 */

  public void setAssgnContFlag(Integer AssgnContFlagIn) {
    AssgnContFlag = AssgnContFlagIn;
  }

  public void translateFromMap() {
    InvAutoAsgnIn = InvElementObjHelper.fromMapFilter(inputMap, "InvElement");
    AssgnQuantity = (Integer)inputMap.get("AssgnQuantity");
    AssgnContFlag = (Integer)inputMap.get("AssgnContFlag");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjFilter getInvElement( ) {
    return InvAutoAsgnIn;
  }

/**
 *
 * Gets the AssgnQuantity
 * @return Value of the AssgnQuantity
 *
 */

  public Integer getAssgnQuantity( ) {
    return AssgnQuantity;
  }

/**
 *
 * Gets the AssgnContFlag
 * @return Value of the AssgnContFlag
 *
 */

  public Integer getAssgnContFlag( ) {
    return AssgnContFlag;
  }

}
