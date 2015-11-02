/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationInvAssocFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationInvAssocFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationInvAssocFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationInvAssocObjectFilter InvsLocationInvAssocFindIn;
/**
 *
 * Constructor to create a  InvsLocationInvAssocFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationInvAssocFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationInvAssocObjectFilter InvsLocationInvAssocFindInIn) {
    super(id, context, "InvsLocationInvAssocFind");
    InvsLocationInvAssocFindIn = InvsLocationInvAssocFindInIn;
  }

  public void translateToMap() {
    if (InvsLocationInvAssocFindIn != null) {
      Integer index =  InvsLocationInvAssocFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectHelper.toMap(InvsLocationInvAssocFindIn, new HashMap(), "InvsLocationInvAssoc").get("InvsLocationInvAssoc"));
    }
  }


/**
 *
 * Sets the InvsLocationInvAssoc
 * @param InvsLocationInvAssocFindInIn Value of the InvsLocationInvAssocFindIn
 *
 */

  public void setInvsLocationInvAssoc(InvsLocationInvAssocObjectFilter InvsLocationInvAssocFindInIn) {
    InvsLocationInvAssocFindIn = InvsLocationInvAssocFindInIn;
  }

  public void translateFromMap() {
    InvsLocationInvAssocFindIn = InvsLocationInvAssocObjectHelper.fromMapFilter(inputMap, "InvsLocationInvAssoc");
  }

/**
 *
 * Gets the InvsLocationInvAssoc
 * @return Value of the InvsLocationInvAssoc
 *
 */

  public InvsLocationInvAssocObjectFilter getInvsLocationInvAssoc( ) {
    return InvsLocationInvAssocFindIn;
  }

}
