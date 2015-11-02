/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a NoteTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTypeObjectFilter NoteTypeFindIn;
/**
 *
 * Constructor to create a  NoteTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeObjectFilter NoteTypeFindInIn) {
    super(id, context, "NoteTypeFind");
    NoteTypeFindIn = NoteTypeFindInIn;
  }

  public void translateToMap() {
    if (NoteTypeFindIn != null) {
      Integer index =  NoteTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NoteType", NoteTypeObjectHelper.toMap(NoteTypeFindIn, new HashMap(), "NoteType").get("NoteType"));
    }
  }


/**
 *
 * Sets the NoteType
 * @param NoteTypeFindInIn Value of the NoteTypeFindIn
 *
 */

  public void setNoteType(NoteTypeObjectFilter NoteTypeFindInIn) {
    NoteTypeFindIn = NoteTypeFindInIn;
  }

  public void translateFromMap() {
    NoteTypeFindIn = NoteTypeObjectHelper.fromMapFilter(inputMap, "NoteType");
  }

/**
 *
 * Gets the NoteType
 * @return Value of the NoteType
 *
 */

  public NoteTypeObjectFilter getNoteType( ) {
    return NoteTypeFindIn;
  }

}
