/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementBulkFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvElementBulkFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementBulkFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjFilter InvIdBulkIn;
/**
 *
 * Constructor to create a  InvElementBulkFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementBulkFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjFilter InvIdBulkInIn) {
    super(id, context, "InvElementBulkFind");
    InvIdBulkIn = InvIdBulkInIn;
  }

  public void translateToMap() {
    if (InvIdBulkIn != null) {
      Integer index =  InvIdBulkIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvIdBulkIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvIdBulkInIn Value of the InvIdBulkIn
 *
 */

  public void setInvElement(InvElementObjFilter InvIdBulkInIn) {
    InvIdBulkIn = InvIdBulkInIn;
  }

  public void translateFromMap() {
    InvIdBulkIn = InvElementObjHelper.fromMapFilter(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjFilter getInvElement( ) {
    return InvIdBulkIn;
  }

}
