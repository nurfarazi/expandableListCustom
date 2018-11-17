package com.example.nurfarazi.simpleexpandableview.simpleexpandableAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.TextView
import android.widget.Toast
import com.example.nurfarazi.simpleexpandableview.simpleexpandableview.R

class ExpandableListAdapter(
    var context: Context,
    var expandableListView: ExpandableListView,
    var header: MutableList<String>,
    var drugCount: MutableList<String>,
    var totalCost: MutableList<String>,
    var body: MutableList<MutableList<String>>
) : BaseExpandableListAdapter() {
    override fun getGroup(groupPosition: Int): CharSequence? {
        return header[groupPosition]
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View? {
        var convertView = convertView
        if (convertView == null) {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.layout_group, null)
        }
        val title = convertView?.findViewById<TextView>(R.id.tv_title)
        val drugCountText = convertView?.findViewById<TextView>(R.id.drug_count)
        val drugsTotalCountText = convertView?.findViewById<TextView>(R.id.total_count)

        title?.text = getGroup(groupPosition)
        drugCountText?.text = drugCount[groupPosition]
        drugsTotalCountText?.text = totalCost[groupPosition]

        title?.setOnClickListener {
            if (expandableListView.isGroupExpanded(groupPosition))
                expandableListView.collapseGroup(groupPosition)
            else
                expandableListView.expandGroup(groupPosition)
            Toast.makeText(context, getGroup(groupPosition), Toast.LENGTH_SHORT).show()
        }
        return convertView
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return body[groupPosition].size
    }

    override fun getChild(groupPosition: Int, childPosition: Int): String {
        return body[groupPosition][childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
        var convertView = convertView
        if (convertView == null) {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.layout_child, null)
        }
        val drugNameText = convertView?.findViewById<TextView>(R.id.drug_name)
        val drugQuantityText = convertView?.findViewById<TextView>(R.id.drug_quantity)
        val drugAmountText = convertView?.findViewById<TextView>(R.id.drug_amount)


        drugNameText?.text = getChild(groupPosition, childPosition)
        drugQuantityText?.text = "3 Piece"
        drugAmountText?.text = "23 taka"

        drugNameText?.setOnClickListener {
            Toast.makeText(context, getChild(groupPosition, childPosition), Toast.LENGTH_SHORT).show()
        }
        return convertView
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getGroupCount(): Int {
        return header.size
    }

}