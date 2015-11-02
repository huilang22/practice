/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionFindBulkUdtTemplateItem.java
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
 * Class used to create a DescriptionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DescriptionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DescriptionObjectFilter DescriptionFindIn;
/**
 *
 * Constructor to create a  DescriptionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DescriptionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DescriptionObjectFilter DescriptionFindInIn) {
    super(id, context, "DescriptionFind");
    DescriptionFindIn = DescriptionFindInIn;
  }

  public void translateToMap() {
    if (DescriptionFindIn != null) {
      Integer index =  DescriptionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Description", DescriptionObjectHelper.toMap(DescriptionFindIn, new HashMap(), "Description").get("Description"));
    }
  }


/**
 *
 * Sets the Description
 * @param DescriptionFindInIn Value of the DescriptionFindIn
 *
 */

  public void setDescription(DescriptionObjectFilter DescriptionFindInIn) {
    DescriptionFindIn = DescriptionFindInIn;
  }

  public void translateFromMap() {
    DescriptionFindIn = DescriptionObjectHelper.fromMapFilter(inputMap, "Description");
  }

/**
 *
 * Gets the Description
 * @return Value of the Description
 *
 */

  public DescriptionObjectFilter getDescription( ) {
    return DescriptionFindIn;
  }

}
