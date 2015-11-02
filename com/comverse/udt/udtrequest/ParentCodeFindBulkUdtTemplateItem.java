/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ParentCodeFindBulkUdtTemplateItem.java
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
 * Class used to create a ParentCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ParentCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ParentCodeObjectFilter ParentCodeFindIn;
/**
 *
 * Constructor to create a  ParentCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ParentCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ParentCodeObjectFilter ParentCodeFindInIn) {
    super(id, context, "ParentCodeFind");
    ParentCodeFindIn = ParentCodeFindInIn;
  }

  public void translateToMap() {
    if (ParentCodeFindIn != null) {
      Integer index =  ParentCodeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ParentCode", ParentCodeObjectHelper.toMap(ParentCodeFindIn, new HashMap(), "ParentCode").get("ParentCode"));
    }
  }


/**
 *
 * Sets the ParentCode
 * @param ParentCodeFindInIn Value of the ParentCodeFindIn
 *
 */

  public void setParentCode(ParentCodeObjectFilter ParentCodeFindInIn) {
    ParentCodeFindIn = ParentCodeFindInIn;
  }

  public void translateFromMap() {
    ParentCodeFindIn = ParentCodeObjectHelper.fromMapFilter(inputMap, "ParentCode");
  }

/**
 *
 * Gets the ParentCode
 * @return Value of the ParentCode
 *
 */

  public ParentCodeObjectFilter getParentCode( ) {
    return ParentCodeFindIn;
  }

}
