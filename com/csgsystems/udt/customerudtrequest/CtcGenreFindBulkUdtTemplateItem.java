/*
 * Generated code DO NOT EDIT
 * Generated file: CtcGenreFindBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcGenreFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcGenreFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcGenreObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcGenreFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcGenreFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGenreObjectFilter FindInIn) {
    super(id, context, "CtcGenreFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(FindIn, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }


/**
 *
 * Sets the CtcGenre
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcGenre(CtcGenreObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcGenreObjectHelper.fromMapFilter(inputMap, "CtcGenre");
  }

/**
 *
 * Gets the CtcGenre
 * @return Value of the CtcGenre
 *
 */

  public CtcGenreObjectFilter getCtcGenre( ) {
    return FindIn;
  }

}
