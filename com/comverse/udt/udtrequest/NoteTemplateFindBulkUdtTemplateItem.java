/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTemplateFindBulkUdtTemplateItem.java
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
 * Class used to create a NoteTemplateFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTemplateFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTemplateObjectFilter NoteTemplateFindIn;
/**
 *
 * Constructor to create a  NoteTemplateFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTemplateFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTemplateObjectFilter NoteTemplateFindInIn) {
    super(id, context, "NoteTemplateFind");
    NoteTemplateFindIn = NoteTemplateFindInIn;
  }

  public void translateToMap() {
    if (NoteTemplateFindIn != null) {
      Integer index =  NoteTemplateFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NoteTemplate", NoteTemplateObjectHelper.toMap(NoteTemplateFindIn, new HashMap(), "NoteTemplate").get("NoteTemplate"));
    }
  }


/**
 *
 * Sets the NoteTemplate
 * @param NoteTemplateFindInIn Value of the NoteTemplateFindIn
 *
 */

  public void setNoteTemplate(NoteTemplateObjectFilter NoteTemplateFindInIn) {
    NoteTemplateFindIn = NoteTemplateFindInIn;
  }

  public void translateFromMap() {
    NoteTemplateFindIn = NoteTemplateObjectHelper.fromMapFilter(inputMap, "NoteTemplate");
  }

/**
 *
 * Gets the NoteTemplate
 * @return Value of the NoteTemplate
 *
 */

  public NoteTemplateObjectFilter getNoteTemplate( ) {
    return NoteTemplateFindIn;
  }

}
