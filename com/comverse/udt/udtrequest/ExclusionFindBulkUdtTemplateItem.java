/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionFindBulkUdtTemplateItem.java
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
 * Class used to create a ExclusionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ExclusionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExclusionObjectFilter excFindIntIn;
/**
 *
 * Constructor to create a  ExclusionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExclusionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ExclusionObjectFilter excFindIntInIn) {
    super(id, context, "ExclusionFind");
    excFindIntIn = excFindIntInIn;
  }

  public void translateToMap() {
    if (excFindIntIn != null) {
      Integer index =  excFindIntIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Exclusion", ExclusionObjectHelper.toMap(excFindIntIn, new HashMap(), "Exclusion").get("Exclusion"));
    }
  }


/**
 *
 * Sets the Exclusion
 * @param excFindIntInIn Value of the excFindIntIn
 *
 */

  public void setExclusion(ExclusionObjectFilter excFindIntInIn) {
    excFindIntIn = excFindIntInIn;
  }

  public void translateFromMap() {
    excFindIntIn = ExclusionObjectHelper.fromMapFilter(inputMap, "Exclusion");
  }

/**
 *
 * Gets the Exclusion
 * @return Value of the Exclusion
 *
 */

  public ExclusionObjectFilter getExclusion( ) {
    return excFindIntIn;
  }

}
